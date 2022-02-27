package com.example.manager;

import com.example.command.Command;

/**
 *  Invoker
 */
public class CommandManagerSimple {

    public void runCommand(Command command) {
        command.execute();
    }

}
