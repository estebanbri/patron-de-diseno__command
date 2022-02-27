package com.example.practice.command.impl;

import com.example.practice.command.Command;
import com.example.practice.receiver.Receiver;

public class EncenderCommand implements Command {

    private Receiver receiver;

    public EncenderCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        this.receiver.encender();
    }
}
