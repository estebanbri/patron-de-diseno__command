package com.example.teory.manager;

import com.example.teory.command.Command;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 *  Invoker
 */
public class CommandManagerDoAndUndo {

    /**
     *  Pila de comandos que vayamos ejecutando
     */
    private Deque<Command> doneCommandList = new ArrayDeque<>();

    /**
     *  Pila de comandos que vayamos revirtiendo. (Contendra los comandos que fueron desechos para que
     *  el usuario puede rehacer lo que habia desechado)
     */
    private Deque<Command> undoneCommandList = new ArrayDeque<>();

    public void runCommand(Command command) {
        command.execute();
        this.doneCommandList.addLast(command);
        this.resetUndoneCommandList();
    }

    public void rollbackLastCommand() {
        if(doneCommandList.isEmpty()) return;
        Command lastDoneCommand = this.doneCommandList.removeLast();
        lastDoneCommand.undo();
        this.undoneCommandList.addLast(lastDoneCommand);
    }

    public void redoLastUndoneCommand() {
        if(undoneCommandList.isEmpty()) return;
        Command lastUndoneCommand = this.undoneCommandList.removeLast();
        lastUndoneCommand.execute();
        this.doneCommandList.addLast(lastUndoneCommand);
    }

    private void resetUndoneCommandList() {
        this.undoneCommandList.clear();
    }

}
