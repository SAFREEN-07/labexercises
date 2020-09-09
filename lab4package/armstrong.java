/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4package;

import lab4subpack.arithmetic;

/**
 *
 * @author 91936
 */
public class armstrong {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         arm n=new arm();
          n.show(370);
          int remainder;
          int result = 0;
          int originalnum=153;
          
        while(originalnum!=0)
        {
            remainder=  originalnum%10;
            result+=Math.pow(remainder,3);
            originalnum/=10;
            
        }
        if(result==153)
            System.out.println(n +"is an armstrong number");
        else
            System.out.println(n +"is not an armstrong number");
        
        
        
     System.out.println("\n PERFORMING ARITHMETIC OPERATIONS");
    arithmetic a=new arithmetic();
    System.out.println("\n adding two numbers");
    a.add(10,5);
     arithmetic b=new arithmetic();
    System.out.println("\n subtracting two numbers");
    b.sub(20,10);
    arithmetic c=new arithmetic();
    System.out.println("\n Multiplying two numbers");
    c.mul(5,2);
    arithmetic d=new arithmetic();
    System.out.println("\n Dividing two numbers");
    d.div(50,10);
    arithmetic e=new arithmetic();
    System.out.println("\n Modulus of two numbers");
    e.mod(15,7);
       
        // TODO code application logic here
    }
    
}
