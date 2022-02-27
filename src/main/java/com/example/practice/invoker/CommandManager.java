package com.example.practice.invoker;

import com.example.practice.command.Command;

public class CommandManager {

    public void runCommand(Command command) {
        command.execute();
    }

}
