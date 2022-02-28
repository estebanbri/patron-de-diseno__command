package com.example.teory.receiver.impl;

import com.example.teory.receiver.Receiver;

public class ConcreteReceiver implements Receiver {

    private String data;

    @Override
    public String getData() {
        return data;
    }

    @Override
    public void setData(String data) {
        this.data = data;
    }
}
