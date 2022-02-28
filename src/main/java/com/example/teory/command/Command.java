package com.example.teory.command;


import com.example.teory.receiver.Receiver;

public abstract class Command {

    protected Receiver receiver;

    protected Command(Receiver receiver) {
        this.receiver = receiver;
    }

    public abstract void execute();
    public abstract void undo();
}
