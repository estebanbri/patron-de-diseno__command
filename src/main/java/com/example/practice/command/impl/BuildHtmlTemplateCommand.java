package com.example.practice.command.impl;

import com.example.practice.command.Command;
import com.example.practice.entity.Email;
import com.example.practice.receiver.Container;

import java.util.Collection;


public class BuildHtmlTemplateCommand extends Command {

    public BuildHtmlTemplateCommand(Container container) {
        super(container);
    }

    @Override
    public void execute() {
        Collection<Email> emailsPendingToSend = this.container.getData(Email.class);
        emailsPendingToSend.forEach(email -> email.setBody(buildHtmlBody(email)));
        this.container.setData(Email.class, emailsPendingToSend);
    }

    private String buildHtmlBody(Email email) {
        return String.format("<h1>Bienvenido %s este es un mail</h1>", email.getTo());
    }


}