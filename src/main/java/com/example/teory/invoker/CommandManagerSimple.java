package com.example.teory.invoker;

import com.example.teory.command.Command;

public class CommandManagerSimple {

    public void runCommand(Command command) {
        command.execute();
    }

}
