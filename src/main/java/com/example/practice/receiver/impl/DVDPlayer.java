package com.example.practice.receiver.impl;

import com.example.practice.receiver.Receiver;

public class DVDPlayer implements Receiver {
    @Override
    public void encender() {
        System.out.println("Ejecutando logica de encendido de DVDPlayer");
    }
}