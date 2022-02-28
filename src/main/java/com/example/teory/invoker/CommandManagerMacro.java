package com.example.teory.invoker;

import com.example.teory.command.Command;
import com.example.teory.command.impl.ConcreteCommandA;
import com.example.teory.command.impl.ConcreteCommandB;
import com.example.teory.receiver.Receiver;
import com.example.teory.receiver.impl.ConcreteReceiver;

import java.util.ArrayList;
import java.util.List;

public class CommandManagerMacro {

    private static List<Command> MACRO_COMMAND_1 = new ArrayList<>();

    private static void initMacro() {
        Receiver receiver = new ConcreteReceiver();
        MACRO_COMMAND_1.add(new ConcreteCommandA(receiver));
        MACRO_COMMAND_1.add(new ConcreteCommandB(receiver));
    }

    public void runCommandsMacro() {
        MACRO_COMMAND_1.forEach(command -> command.execute());
    }

}
