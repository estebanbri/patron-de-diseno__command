package com.example.teory.command.impl;

import com.example.teory.command.Command;

public class ConcreteCommandA implements Command {

    private String value;

    public ConcreteCommandA(String value) {
        this.value = value;
    }

    @Override
    public void execute() {
        System.out.println("ConcreteCommandA -> execute(): adding 'a'");
        this.value = this.value + "a";
        System.out.println(this.value);
    }

    @Override
    public void undo() {
        System.out.println("ConcreteCommandA -> undo(): removing 'a'");
        this.value = this.value.substring(0, this.value.length() - 1);
        System.out.println(this.value);
    }
}
