package com.example.pmissechanab.tp1.taches;

public class TacheDoesntExistException extends Exception {
    private String tacheName;
    public TacheDoesntExistException(String tacheName){
        this.tacheName=tacheName;
    }

    public String getTacheName() {
        return tacheName;
    }
}