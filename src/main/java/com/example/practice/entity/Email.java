package com.example.practice.entity;

public class Email {

    private String to;

    private String from;

    private String body;

    private String state;

    public Email(String to, String from, String state) {
        this.to = to;
        this.from = from;
        this.state = state;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
