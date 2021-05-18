package com.example.apphandin.ui.garbage;

public class Garbage {
    private String message;

    public Garbage(String message) {
        this.message = message;
    }

    public Garbage() {}

    public String getBody() {
        return message;
    }

    public void setBody(String name) {
        this.message = name;
    }
}
