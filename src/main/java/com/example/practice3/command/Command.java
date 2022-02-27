package com.example.practice3.command;

import com.example.practice3.receiver.Receiver;

public interface Command {
    void execute(Receiver receiver, String param);
    void undo(Receiver receiver);
}
