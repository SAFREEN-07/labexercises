/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;

/**
 *
 * @author 91936
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class comparator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<empl>list=new ArrayList<empl>();
        list.add(new empl("Surya",6000));
        list.add(new empl("Santhiya",6000));
        list.add(new empl("Akshaya",4500));
        list.add(new empl("Saran",8000));
        list.add(new empl("Bala",8000));
        list.add(new empl("Kavitha",12000));
        list.add(new empl("Arun",11000));
        list.add(new empl("Nadhiya",7000));
        list.add(new empl("Abisheik",15000));
        list.add(new empl("Tom",9000));
        list.add(new empl("Alya",7500));
        list.add(new empl("Riddle",13800));
        list.add(new empl("Harry",7080));
        list.add(new empl("Brownie",10000));
        list.add(new empl("Selshiya",12500));
        list.add(new empl("Bhavadharani",14000));
        list.add(new empl("Yasin",17000));
        list.add(new empl("Sulthan",8800));
        list.add(new empl("Jessi",6060));
        list.add(new empl("Rameena",9500));
        Collections.sort(list,new Salary());
        System.out.println("Salary sorted list");
        for(empl e:list)
        {
            System.out.println(e);
        }
        // TODO code application logic here
    }
    

}
class Salary implements Comparator<empl>
{
    @Override
    public int compare(empl e1,empl e2)
    {
      if(e1.getSalary()>e2.getSalary())
      {
          return 1;
      }
      else
      {
          return -1;
      }
    }
}
class empl
{
    String name;
    int salary;
   
    public empl(String n,int s)
    {
        this.name=n;
        this.salary=s;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
       this.name=name; 
    }
    public int getSalary()
    {
        return salary;
    }
    public void setSalary(int salary)
    {
        this.salary=salary;
    }
    public String toString()
    {
        return "Name:"+this.name+"-Salary:"+this.salary;
    }
}