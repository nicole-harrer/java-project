/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.pitt.is17.neh33.menumanager;

/**
* Class Appetizer
* author : Nicole
* created: 03/07/2018
*/

 
public class Appetizer {
    private String name;
    private String description;
    private int calories;
    
    public Appetizer(String appName, String desc, int cal){
    name = appName;
    description = desc;
    calories = cal;
    }
    
    public void setName(String newName){
        this.name = newName;
    }

    public String getName(){
        return name;
    }
    
    public void setDescription(String newDesc){
        this.description = newDesc;
    }

    public String getDescription(){
       return(description);
    }

    public void setCal(int newCal){
       this.calories = newCal;
    }

    public int getCal(){
       return(calories);
    }

}