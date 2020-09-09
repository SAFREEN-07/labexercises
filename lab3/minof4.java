/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

import java.util.Scanner;

/**
 *
 * @author 91936
 */
public class minof4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner obj=new Scanner(System.in);
                        System.out.println("Enter the terms");
                            int a=obj.nextInt();
                            int b=obj.nextInt();
                             int c=obj.nextInt();
                             int d=obj.nextInt();
                            int e;
                           e=(a>b && a<c && a<d)?a:(b<c && b<d)?b:(c<d)?c:d;
                            System.out.println("The minimum number is"+e);
        // TODO code application logic here
    }
    
}
