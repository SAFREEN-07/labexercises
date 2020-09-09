/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

import java.util.Scanner;

/**
 *
 * @author 91936
 */
public class heirarchialdemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        student1 s=new student1();
        s.studentdetails();
      
        s.show();
        staff1 st=new staff1();
        st.getstaffdetails();
        
        st.show();
        
        // TODO code application logic here
    }
    
}
class book1
{
    String name;
    int accno;
    String author;
    Scanner obj=new Scanner(System.in);
    public void getbookdetails()
    {
      name=obj.next();
      accno=obj.nextInt();
      author=obj.next();
    }
    public void show()
    {
        System.out.println("\n BookName:"+name);
        System.out.println("\n Accessnum:"+accno);
        System.out.println("\n Author:"+author);
              
    }
}
class student1 extends book1
{
    String stname;
    String rollno;
    String dept;
    public void studentdetails()
    {
      super.getbookdetails();
       stname=obj.next();
       rollno=obj.next();
       dept=obj.next();
       
    }
    public void show()
    {
      super.show();
      System.out.println("\n Student Name:"+stname);
      System.out.println("\n Rollnum:"+rollno);
      System.out.println("\n Dept:"+dept);   
    }
        
    
}
class staff1 extends book1
{
    String staffname;
    String sid;
    String dept;
    void getstaffdetails()
    {
        
     super.getbookdetails();
    staffname=obj.next();
    sid=obj.next();
    dept=obj.next();
    }
    public void show()
    {
        super.show();
       System.out.println("\n Staff Name:"+staffname);
      System.out.println("\n Staffid:"+sid);
      System.out.println("\n Dept:"+dept);  
    }
    
}
