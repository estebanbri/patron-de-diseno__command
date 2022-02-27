package com.example.teory;

import com.example.teory.command.Command;
import com.example.teory.command.impl.ConcreteCommandA;
import com.example.teory.command.impl.ConcreteCommandB;
import com.example.teory.manager.CommandManagerDoAndUndo;
import com.example.teory.manager.CommandManagerMacro;
import com.example.teory.manager.CommandManagerSimple;

public class Client {
    public static void main(String[] args) {
        System.out.println("Simple like:");
        CommandManagerSimple managerSimple = new CommandManagerSimple();

        Command command = new ConcreteCommandA("simple");
        managerSimple.runCommand(command);
        
        System.out.println("--------------------------------------------------");
        System.out.println("Do - Undo like:");
        CommandManagerDoAndUndo managerDoUndo = new CommandManagerDoAndUndo();

        Command commandA = new ConcreteCommandA("undo-redo");
        Command commandB = new ConcreteCommandB("undo-redo");
        managerDoUndo.runCommand(commandA);
        managerDoUndo.runCommand(commandB);

        managerDoUndo.rollbackLastCommand();
        managerDoUndo.rollbackLastCommand();


        System.out.println("--------------------------------------------------");
        System.out.println("Macro like:");
        CommandManagerMacro managerMacro = new CommandManagerMacro();
        Command command1 = new ConcreteCommandA("macroItemA");
        Command command2 = new ConcreteCommandB("macroItemB");

        managerMacro.addCommand(command1);
        managerMacro.addCommand(command2);

        managerMacro.runCommandsMacro();

    }
}