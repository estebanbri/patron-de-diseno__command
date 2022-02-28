package com.example.practice.command.impl;

import com.example.practice.command.Command;
import com.example.practice.entity.Email;
import com.example.practice.receiver.Container;

import java.util.Collection;

public class SendEmailCommand extends Command {

    public SendEmailCommand(Container container) {
        super(container);
    }

    @Override
    public void execute() {
        Collection<Email> emailsReadyToSend = this.container.getData(Email.class);
        emailsReadyToSend.forEach(this::sendEmail);
        this.container.clearData(Email.class);
    }

    private void sendEmail(Email email) {
        System.out.format("--- Sending email to %s --- from %s with body: %s\n", email.getTo(), email.getFrom(), email.getBody());
    }
}
