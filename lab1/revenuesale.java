/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.util.Scanner;

/**
 *
 * @author 91936
 */
public class revenuesale {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double rate=0;
        double amount=0;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter unit  price:");
        int n=obj.nextInt();
        System.out.println("Enter the quantity of product:");
        double q=obj.nextDouble();
        double revenue=0.0;
        if((q>=100)&&(q<=120))
        {
            rate=10/100;
            amount=0.0;
            revenue=n*q;
            amount=revenue*0.1;
            revenue=revenue-amount;
            
          
        }
        else
        {
            rate=15/100;
            revenue=n*q;
            amount=revenue*rate;
            revenue=revenue-amount;
            
        }
        System.out.println("The revenue from sale:"+revenue);
        System.out.println("After discount:"+(n*q));
        
        
        // TODO code application logic here
    }
    
}
