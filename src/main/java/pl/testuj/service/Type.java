package pl.testuj.service;

public enum Type {
    START("start"),BROADCAST("broadcast"),END("end");

    private final String description;

    private Type(String description){
        this.description = description;
    }

    public String getDescription(){
        return description;
    }
}
