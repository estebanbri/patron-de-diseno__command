package com.example.practice3.command.impl;

import com.example.practice3.command.Command;
import com.example.practice3.receiver.Receiver;

public class PaintCommand implements Command {

    private Receiver receiver;

    @Override
    public void execute(Receiver receiver, String param) {
        this.receiver.paint(param);
    }

    @Override
    public void undo(Receiver receiver) {

    }
}