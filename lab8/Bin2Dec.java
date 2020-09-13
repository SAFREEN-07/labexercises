/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8;

import java.util.Scanner;

/**
 *
 * @author 91936
 */
public class Bin2Dec {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        String Binstr;
        int Binstrlen;
        int dec=0;
        System.out.println("Enter a Binary String:");
        Binstr=obj.next();
        Binstrlen=Binstr.length();
        for(int pos=0;pos<Binstrlen;pos++)
        {
            int order=Binstrlen-1-pos;
            char binchar=Binstr.charAt(pos);
            if(binchar=='1')
            {
                dec+=Math.pow(2,order);
            }
             
            else if(binchar !='0')
            {
                System.out.printf("Error:Invalid binary string  "+Binstr+"");
                System.exit(0);
            }
           
        }
      
       System.out.printf("The equivalent decimal number for "+Binstr+" is : " +dec);
     
}
}
 
       
       
        //To change body of generated methods, choose Tools | Templates.
    
    


