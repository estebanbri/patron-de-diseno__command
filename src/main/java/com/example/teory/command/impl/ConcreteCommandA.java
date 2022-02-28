package com.example.teory.command.impl;

import com.example.teory.command.Command;
import com.example.teory.receiver.Receiver;

public class ConcreteCommandA extends Command {

    public ConcreteCommandA(Receiver receiver) {
        super(receiver);
    }

    @Override
    public void execute() {
        String dataFromDB = callDB();
        this.receiver.setData(dataFromDB); // esto va a ser seteado para que los demas comandos reutilicen la info obtenida aqui es como un pasaje en cascada de data a traves del receiver
        System.out.format("Ejecutando ConcreteCommandA logic con la data obtenida de dataFromDB = (%s)\n", dataFromDB);
    }

    @Override
    public void undo() {
        System.out.println("undo logic");
    }

    private String callDB() {
        return "Example data: 8 rows in DB";
    }

}

