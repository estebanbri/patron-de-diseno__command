package com.example.practice.receiver;

import java.util.Collection;

public interface Container {
    <T> Collection<T> getData(Class<T> key);
    <T> void setData(Class<T> key, T value);
    <T> void setData(Class<T> key, Collection<T> value);
    <T> void clearData(Class<T> key);
}
