package com.example.teory;

import com.example.teory.command.Command;
import com.example.teory.command.impl.ConcreteCommandA;
import com.example.teory.command.impl.ConcreteCommandB;
import com.example.teory.invoker.CommandManagerSimple;
import com.example.teory.receiver.Receiver;
import com.example.teory.receiver.impl.ConcreteReceiver;

public class Client {
    public static void main(String[] args) {
        Receiver receiver = new ConcreteReceiver();
        CommandManagerSimple commandManagerSimple = new CommandManagerSimple();

        Command commandA = new ConcreteCommandA(receiver);
        Command commandB = new ConcreteCommandB(receiver);

        commandManagerSimple.runCommand(commandA);
        commandManagerSimple.runCommand(commandB);
    }
}
