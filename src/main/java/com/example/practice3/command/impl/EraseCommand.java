package com.example.practice3.command.impl;

import com.example.practice3.command.Command;
import com.example.practice3.receiver.Receiver;

public class EraseCommand implements Command {

    private Receiver receiver;

    @Override
    public void execute(Receiver receiver, String param) {
        this.receiver.erase(param);
    }

    @Override
    public void undo(Receiver receiver) {

    }
}