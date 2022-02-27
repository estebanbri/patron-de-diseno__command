package com.example.practice3.invoker;

import com.example.practice3.command.Command;
import com.example.practice3.command.history.CommandHistory;
import com.example.practice3.command.impl.EraseCommand;
import com.example.practice3.command.impl.PaintCommand;
import com.example.practice3.command.impl.PickColorCommand;
import com.example.practice3.receiver.impl.Canvas;

import java.util.Arrays;
import java.util.List;

public class CanvasCommandInvoker {

    private List<Command> registeredCommands;
    private CommandHistory commandHistory;
    private Canvas canvas = new Canvas();

    public CanvasCommandInvoker() {
        registeredCommands = Arrays.asList(new EraseCommand(), new PaintCommand(), new PickColorCommand());
    }

    public void runCommands(String commandName, String params) {
        for(Command command: registeredCommands) {
            if(command.getClass().getSimpleName().equalsIgnoreCase(commandName)) {
                command.execute(canvas, params);
            }
        }


    }

}
