package com.example.teory.manager;

import com.example.teory.command.Command;

/**
 *  Invoker
 */
public class CommandManagerSimple {

    public void runCommand(Command command) {
        command.execute();
    }

}
