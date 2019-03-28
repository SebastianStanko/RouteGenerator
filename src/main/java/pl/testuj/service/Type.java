package pl.testuj.service;

public enum Type {
    start("start"),broadcast("broadcast"),end("end");

    private String description;

    Type(String description){
        this.description = description;
    }
}
