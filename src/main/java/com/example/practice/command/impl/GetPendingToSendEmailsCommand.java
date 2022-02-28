package com.example.practice.command.impl;

import com.example.practice.command.Command;
import com.example.practice.entity.Email;
import com.example.practice.receiver.Container;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GetPendingToSendEmailsCommand extends Command {

    public GetPendingToSendEmailsCommand(Container container) {
        super(container);
    }

    @Override
    public void execute() {
        List<Email> emailsPendingToSend = getPendingToSendEmailsFromDB();
        this.container.setData(Email.class, emailsPendingToSend);
    }



    private List<Email> getPendingToSendEmailsFromDB() {
        // Simulo llamada a la base de datos en bsuqueda de los email que esten pendientes para envio
        return Stream.of(
                new Email("esteban@esteban.com","andres@andres.com", "PendingToSend"),
                new Email("juan@juan.com","maria@maria.com", "PendingToSend"),
                new Email("elias@elias.com","raul@raul.com", "PendingToSend"),
                new Email("pablo@pablo.com","jose@jose.com", "PendingToSend")
        ).collect(Collectors.toList());
    }

}

