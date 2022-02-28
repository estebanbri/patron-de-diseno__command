package com.example.practice.invoker;

import com.example.practice.command.Command;
import com.example.practice.command.impl.BuildHtmlTemplateCommand;
import com.example.practice.command.impl.GetPendingToSendEmailsCommand;
import com.example.practice.command.impl.SendEmailCommand;
import com.example.practice.receiver.Container;
import com.example.practice.receiver.impl.ContainerImpl;

import java.util.Arrays;
import java.util.List;

public class CommandManager {

    public static List<Command> getCommandsBatchSendEmail() {
        Container container = new ContainerImpl();
        return Arrays.asList(
                new GetPendingToSendEmailsCommand(container),
                new BuildHtmlTemplateCommand(container),
                new SendEmailCommand(container)
                //,new SendMobileNotification()   // El dia de mañana te dicen que despues de enviar el email tenes que enviar una notificacion y no tenes que abrir las demas clases crear un comando nuevo y listo
        );
    }

    // public void runCommand(Command command) { command.execute(); }

    public void runBatch(List<Command> commands) {
        commands.forEach(command -> command.execute());
    }



}
