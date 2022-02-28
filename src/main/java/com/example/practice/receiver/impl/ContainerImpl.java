package com.example.practice.receiver.impl;

import com.example.practice.receiver.Container;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ContainerImpl implements Container {

    private Map map = new HashMap();

    @Override
    public <T> Collection<T> getData(Class<T> key) {
        return (Collection<T>) this.map.get(key);
    }

    @Override
    public <T> void setData(Class<T> key, T value) {
        this.map.put(key, value);
    }

    @Override
    public <T> void setData(Class<T> key, Collection<T> value) {
        this.map.put(key, value);
    }

    @Override
    public <T> void clearData(Class<T> key) {
        this.map.remove(key);
    }
}
