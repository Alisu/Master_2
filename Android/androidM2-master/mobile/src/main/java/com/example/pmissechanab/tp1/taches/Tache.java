package com.example.pmissechanab.tp1.taches;

import java.util.Date;


/*
* Taches are distinguished by their names only.
*/
public class Tache {
    /******* attributes  *******/
    private String name;
    private String Type;
    private String description;

    private Date startDate;
    private Date endDate;
    /*
    * A task that is done, is deleted, so no completion attribute
    */

    /******* constructors *******/
    /*
    *   name, start, end are mandatory for a task creation.
    */
    public Tache(String name, Date start, Date end) throws NullPointerException{
        if( ! (name==null || start==null || end==null)){//If nothing is null, we can create a task. Otherwise, throw exception
            this.name = name;
            this.Type = new String("Empty");
            this.description = new String("empty");
            this.startDate = start;
            this.endDate = end;
        }
        else{
            throw new NullPointerException();
        }
    }

    /*
    * name, start, end are mandatory for a task creation.
    * type and desc can be null, and a default empty String will be used instead.
    * Null pointer exception thrown, if a mandatory parameter is null.
    */
    public Tache(String name, String type, String desc, Date start, Date end) throws NullPointerException {
        if( ! (name==null || start==null || end==null)){//If all mandatory parameter aren't null, we can create a task. Otherwise, throw exception
            this.name=name;
            this.Type=(type==null? new String("empty"): type);
            this.description=(type==null? new String("empty"): desc);
            this.startDate=start;
            this.endDate=end;
        }
        else{
            throw new NullPointerException();
        }
    }

    /******* accessors *******/
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    private String type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
