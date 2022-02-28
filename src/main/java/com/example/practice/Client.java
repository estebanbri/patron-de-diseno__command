package com.example.practice;

import com.example.practice.command.Command;
import com.example.practice.command.impl.GetPendingToSendEmailsCommand;
import com.example.practice.command.impl.BuildHtmlTemplateCommand;
import com.example.practice.command.impl.SendEmailCommand;
import com.example.practice.invoker.CommandManager;
import com.example.practice.receiver.Container;
import com.example.practice.receiver.impl.ContainerImpl;

import java.util.Arrays;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        CommandManager commandManager = new CommandManager();
        commandManager.runBatch(CommandManager.getCommandsBatchSendEmail());
    }


}
