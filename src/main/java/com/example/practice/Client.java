package com.example.practice;

import com.example.practice.command.Command;
import com.example.practice.command.impl.EncenderCommand;
import com.example.practice.invoker.CommandManager;
import com.example.practice.receiver.Receiver;
import com.example.practice.receiver.impl.DVDPlayer;
import com.example.practice.receiver.impl.TV;

public class Client {
    public static void main(String[] args) {

        // Receivers
        Receiver tv = new TV();
        Receiver dvdPlayer = new DVDPlayer();

        // Command (same command different receivers)
        Command encenderCommandTV = new EncenderCommand(tv);
        Command encenderCommandDVD = new EncenderCommand(dvdPlayer);

        // Invoker
        CommandManager commandManager = new CommandManager();
        commandManager.runCommand(encenderCommandTV);
        commandManager.runCommand(encenderCommandDVD);
    }
}
