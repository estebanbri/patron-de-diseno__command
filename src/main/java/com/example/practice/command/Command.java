package com.example.practice.command;


import com.example.practice.receiver.Container;

public abstract class Command {

    protected Container container;

    protected Command(Container container) {
        this.container = container;
    }

    public abstract void execute();

}
