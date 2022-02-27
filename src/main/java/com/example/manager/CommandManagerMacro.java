package com.example.manager;

import com.example.command.Command;

import java.util.ArrayList;
import java.util.List;

/**
 *  Invoker
 */
public class CommandManagerMacro {

    private List<Command> macroCommands = new ArrayList<>();

    public void addCommand(Command command) {
        macroCommands.add(command);
    }

    public void runCommandsMacro() {
        macroCommands.forEach(command -> command.execute());
    }

}
