/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.pitt.is17.neh33.menumanager;

/**
* Class Menu
* author : Nicole
* created: 03/07/2018
*/ 
 
public class Menu {
        private String name;
        private Appetizer appetizer;
        private Entree entree;
        private Side side;
        private Beer beer;
        

    
    public Menu(String menuName){
        name = menuName;
        appetizer = null;
	entree = null;
	side = null;
	beer = null;
        
    }
    public void setName(String newName){
    this.name = newName;
    }

    public String getName(){
    return name;
    }
    
    
    public Menu(String menuName, Entree newEntree, Side newSide){
        name = menuName;
        entree = newEntree;
        side = newSide;
        appetizer = null;
	beer = null;
    }
    public Menu(String menuName, Entree newEntree, Side newSide, Appetizer newApp, Beer newBeer){
        name = menuName;
        entree = newEntree;
        side = newSide;
        appetizer = newApp;
        beer = newBeer; 

	
    }

//totalCalories(): sums the calories of all the parts of the menu (Beer, Appetizer, Entree and Side)
//int totalCalories() {
    public int totalCalories() {
        int totalCal = 0;
        int calCount = 0;
        
        if (entree != null) {
        calCount = entree.getCal();
        totalCal = totalCal + calCount;
        calCount = 0;
        } else {}
        
        if (side != null) {
        calCount = side.getCal();
        totalCal = totalCal + calCount;
        calCount = 0;
        } else {}
        
        if (appetizer != null) {
        calCount = appetizer.getCal();
        totalCal = totalCal + calCount;
        calCount = 0;
        } else {}
        
        if (beer != null) {
        calCount = beer.getCal();
        totalCal = totalCal + calCount;
        calCount = 0;
        } else {}
        return totalCal;
    }


    public String description() {
        String totalDescriptions = "";

        if (entree != null) {
        totalDescriptions = totalDescriptions + entree.getDescription();
        totalDescriptions = totalDescriptions + "\n";
        } else {
        totalDescriptions = totalDescriptions + "N/A" + "\n";
        }
        if (side != null) {
        totalDescriptions = totalDescriptions + side.getDescription();
        totalDescriptions = totalDescriptions + "\n";
        } else {
        totalDescriptions = totalDescriptions + "N/A" + "\n";
        }
        if (appetizer != null) {
        totalDescriptions = totalDescriptions + appetizer.getDescription();
        totalDescriptions = totalDescriptions + "\n";
        } else {
        totalDescriptions = totalDescriptions + "N/A" + "\n";
        }
        if (beer != null) {
        totalDescriptions = totalDescriptions + beer.getDescription();
        totalDescriptions = totalDescriptions + "\n";
        } else {
        totalDescriptions = totalDescriptions + "N/A" + "\n";
        }
        return totalDescriptions;
    }
    
    public String printMenu(Menu menuOne) {
      String menuName = menuOne.getName();
      int menuCal = menuOne.totalCalories();
      String menuDesc = menuOne.description();
      String menuText = menuName + "\n" + menuCal + "\n" + menuDesc;
      return menuText;
    }
}
