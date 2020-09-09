/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author 91936
 */
public class Static {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        program obj=new program();
        System.out.println("Sample :1");
        obj.pro();
         program obj1=new program();
        System.out.println("Sample :2");
        obj1.pro();
         program obj2=new program();
        System.out.println("Sample :3");
        obj2.pro();
        
        // TODO code application logic here
    }
    
}
class program
{
    static int a=50;
    int b=10;
    void pro()
    {
        a=a*50;
        b=b*50;
        System.out.println(a);
        System.out.println(b);
    }
        
        
}

        // TODO code application logic here
    
    

