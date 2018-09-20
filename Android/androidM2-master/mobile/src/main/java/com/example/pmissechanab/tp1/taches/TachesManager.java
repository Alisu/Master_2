package com.example.pmissechanab.tp1.taches;

import java.io.FileInputStream;
import java.util.ArrayList;

public class TachesManager {
    /******* attribute *******/
    private ArrayList<Tache> currentTaches;
    /*
    * Finished tasks are deleted.
    * In a ArrayList rather than a map, because we want to have control over it.
    */


    /******* constructors *******/
    public TachesManager(){
        currentTaches=new ArrayList<>();
    }

    public TachesManager(FileInputStream fis){
        //todo @théo
    }

    /******* methods *******/
    /*
     * @parameter newtaches : Tache we want to add to the list
     * Taches are distinguished by their names only.
     */
    public void addTache(Tache newTache) throws TacheExistException {
        if(DoesTaskExist(newTache.getName())==null){
            currentTaches.add(newTache);
        }
        else{
            throw new TacheExistException(newTache.getName());
        }

    }
    public void deleteTache(Tache oldTache) throws TacheDoesntExistException{
        Tache ToBeDeletedTache=DoesTaskExist(oldTache.getName());
        if(ToBeDeletedTache!=null){
            currentTaches.remove(ToBeDeletedTache);
        }
        else{
            throw new TacheDoesntExistException(oldTache.getName());
        }
    }

    private Tache DoesTaskExist(String newName){
        for (Tache t : currentTaches) {
            if (newName.compareTo(t.getName())==0) {
                return t;
            }
        }
        return null;
    }

    /******* accessors *******/
    public Tache GetTacheByName(String tacheName) throws TacheDoesntExistException {
        Tache neededTache=DoesTaskExist(tacheName);
        if(neededTache!=null){
            return neededTache;
        }
        else{
            throw new TacheDoesntExistException(tacheName);
        }


    }

}
