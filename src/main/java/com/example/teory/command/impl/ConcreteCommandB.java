package com.example.teory.command.impl;

import com.example.teory.command.Command;

public class ConcreteCommandB implements Command {

    private String value;

    public ConcreteCommandB(String value) {
        this.value = value;
    }

    @Override
    public void execute() {
        System.out.println("ConcreteCommandB -> execute(): adding 'b'");
        this.value = this.value + "b";
        System.out.println(this.value);
    }

    @Override
    public void undo() {
        System.out.println("ConcreteCommandB -> undo(): removing 'b'");
        this.value = this.value.substring(0, this.value.length() - 1);
        System.out.println(this.value);
    }
}
