
package edu.pitt.is17.neh33.menumanager;
/** Class MenuTest
 * author : Nicole
* created: 03/09/2018
*/
public class MenuTest{
        
    
    public static void main(String[] args) {

      
        Appetizer frenchFries = new Appetizer("frenchFries", "a bunch of fried potatoes", 500);
      
        Entree chickenSandwich = new Entree("crispy chicken sandwich", "crispy chicken with lettuce tomato and mayo on a toasted bun",700);
      
        Entree baconator = new Entree("bacon cheesburger","a double patty burger with cheese and bacon on a toasted bun",700);
      
        Side salad = new Side("side salad", "romaine lettuce with tomato, goat cheese, almonds, berries and your choice of dressing", 400);
      
        Beer belgianWheatBeer = new Beer("Alagash White","Brewed with a generous portion of wheat and spiced with coriander and Curacao orange peel, this beer is fruity, refreshing and slightly cloudy in appearance.", 200);
      
        Beer lambic = new Beer("Lindemans Framboise","A clean natural tasting brew with undertones of fresh raspberries and a wonderful aroma.",400);
      
      
      
        Menu restarauntTwo = new Menu("restaurantTwo Menu", baconator, salad);  
       
        Menu restarauntOne = new Menu("restaurantOne Menu", chickenSandwich, salad, frenchFries, lambic);
      
      

      
        String firstMenu = "Menu Name: " + restarauntOne.getName() + "\n";
        firstMenu += "Total Calories: " + restarauntOne.totalCalories() + "\n";
        firstMenu += "Description: " + restarauntOne.description() + "\n";        
    //print menu1 i.e. the menu name, totoal calories and description.
        System.out.print(firstMenu);

        String secondMenu = "Menu Name: " + restarauntTwo.getName() + "\n";
        secondMenu += "Total Calories: " + restarauntTwo.totalCalories() + "\n";
        secondMenu += "Description: " + restarauntTwo.description() + "\n";
        //print menu2 i.e. the menu name, totoal calories and description.
        System.out.print(secondMenu);
               
                
               
        
         
    }
}
