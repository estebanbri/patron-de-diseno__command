package com.example.practice2.invoker;

import com.example.practice2.command.Command;

public class CommandManager {

    public void runCommand(Command command) {
        command.execute();
    }

}
