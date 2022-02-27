package com.example.practice2;

import com.example.practice2.command.Command;
import com.example.practice2.command.impl.FireCommand;
import com.example.practice2.command.impl.JumpCommand;
import com.example.practice2.invoker.CommandManager;
import com.example.practice2.receiver.GameActor;
// https://gameprogrammingpatterns.com/command.html
public class Client {

    private static final GameActor gameActor = new GameActor();

    public static void main(String[] args) {
        CommandManager manager = new CommandManager();

        Command command = handleInput("space");

        manager.runCommand(command);
    }

    private static Command handleInput(String input) {
        if("space".equals(input))  return new JumpCommand(gameActor);
        if("click".equals(input))  return new FireCommand(gameActor);
        return null;
    }
}
