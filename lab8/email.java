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
public class email {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("\n enter your firstname:");
        String firstname=obj.next();
        System.out.println("\n enter your lastname:");
        String lastname=obj.next();
        System.out.println("Your Name:"+firstname+" "+lastname);
        String substr="";
        substr=firstname.substring(0,3);
        String substr1="";
        substr1=lastname.substring(0,4);
        String email=substr.concat(substr1);
        email=substr+"."+substr1+"@gmail.com";
        System.out.println(email);
        
        
        
        // TODO code application logic here
    }
    
}
