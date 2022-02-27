package com.example.practice3.receiver.impl;

import com.example.practice3.receiver.Receiver;

public class Canvas implements Receiver {

    public void paint(String param) {
        System.out.println("Canvas: Painting at " + param);
    }
    public void erase(String param) {
        System.out.println("Canvas: Erasing at " + param);
    }
    public void pickColor(String param) {
        System.out.println("Canvas: Picking color from " + param);
    }

}
