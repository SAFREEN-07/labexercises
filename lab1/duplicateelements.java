package lab1;



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
public class duplicateelements {
      private static int i;
        private static int j;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the no of terms:");
        int n=obj.nextInt();
        System.out.println("Enter the terms:");
         int m[]=new int[n];
         for(i=0;i<n;i++)
         {
             m[i]=obj.nextInt();
             
         }
         for(i=0;i<n-1;i++)
         {
           for(j=i+1;j<n;j++)
         {
             if(m[i]==m[j])
                 
         System.out.println("Duplicate elements are found");
             else
         
           System.out.println("not found");
         }
         }
            
        
        
        // TODO code application logic here
    }
    
}
