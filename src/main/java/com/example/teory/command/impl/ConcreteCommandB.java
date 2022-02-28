package com.example.teory.command.impl;

import com.example.teory.command.Command;
import com.example.teory.receiver.Receiver;

public class ConcreteCommandB  extends Command  {

    public ConcreteCommandB(Receiver receiver) {
        super(receiver);
    }

    @Override
    public void execute() {
        String dataFromReceiver = this.receiver.getData();
        System.out.format("Executing ConcreteCommandB logic with data form receiver = {%s}\n", dataFromReceiver);
    }

    @Override
    public void undo() {
        System.out.println("undo logic");
    }

}