package com.example.practice2.command.impl;

import com.example.practice2.command.Command;
import com.example.practice2.receiver.GameActor;

public class JumpCommand implements Command {

    private GameActor gameActor;

    public JumpCommand(GameActor gameActor) {
        this.gameActor = gameActor;
    }

    @Override
    public void execute() {
        this.gameActor.jump();
    }
}
