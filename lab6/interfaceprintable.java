package lab6;



import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 91936
 */
public class interfaceprintable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        restaurant obj=new restaurant();
      
      obj.calculatebill();
      System.out.println("total bill amount:");
      obj.display();
      supermarket obj1=new supermarket();
      
      obj1.calculatebill();
      System.out.println("total bill amount:");
      obj1.display();
    }
    
}
interface printable
{
    
     
     double mealcost=250;
     double fruitscost=300;
     double vegetablecost=350;
     double masala=100;
     abstract void calculatebill();
     abstract void display();
}

 class restaurant implements printable
{
      public  void calculatebill()
    {
      System.out.println("\n meal cost is:"+mealcost);
      
    }
    public  void display()
    {
        
       double tax;
       double totalbill;
      
       tax=0.06*mealcost; 
       totalbill=mealcost+tax;   
       System.out.println(totalbill);
    
        
    }
}
class supermarket implements printable
{
      public  void calculatebill()
    {
      System.out.println("\n total cost of fruits bought is:"+ fruitscost);
      System.out.println("\n total cost of vegetables bought is:"+vegetablecost);
      System.out.println("\n total cost of masala itemsis:"+masala);
      
    }
    public  void display()
    {
       
       double totalbill;
       
        
       totalbill=fruitscost+vegetablecost+masala;   
       System.out.println(totalbill);
    
        
    }
}
