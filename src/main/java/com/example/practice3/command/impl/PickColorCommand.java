package com.example.practice3.command.impl;

import com.example.practice3.command.Command;
import com.example.practice3.receiver.Receiver;

public class PickColorCommand implements Command {

    private Receiver receiver;

    @Override
    public void execute(Receiver receiver, String param) {
        this.receiver.pickColor(param);
    }

    @Override
    public void undo(Receiver receiver) {

    }
}
