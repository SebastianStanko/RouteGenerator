package pl.testuj.service;

public enum Type {
    START("start"),BROADCAST("broadcast"),END("end");

    private String description;

    private Type(String description){
        this.description = description;
    }

}
