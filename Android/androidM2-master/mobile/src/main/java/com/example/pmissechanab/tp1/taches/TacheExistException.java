package com.example.pmissechanab.tp1.taches;

public class TacheExistException extends Exception {
    private String tacheName;
    public TacheExistException(String tacheName){
        this.tacheName=tacheName;
    }

    public String getTacheName() {
        return tacheName;
    }
}
