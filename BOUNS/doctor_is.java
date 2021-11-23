/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo_design_pattern;

/**
 *
 * @author messi
 */
public class doctor_is implements staff
{
    String name;
    int id;
    int age;
    double salary;
    int yearsOFwork;


    @Override
    public void serdata(String name, int id, int age, double salay, int yearsOFwork) 
    {
        this.name=name;
       this.id=id;
       this.age=age;
       this.salary=salary;
       this.yearsOFwork=yearsOFwork;
    }

    @Override
    public void getsalary()
    {
       System.out.println("salary is 2256");
    }

    @Override
    public void getyearsOFwork() 
    {
       System.out.println("yearsOFwork is 26");
    }

    @Override
    public void printDATA()
    {
         System.out.println("doctor of IS name is "  + name + "doctor of IS id is  " + id +  "doctor of IS age is  "  + age + "doctor of IS salary is " + salary + "doctor of IS  yearsOFwork " + yearsOFwork);
    }
    
}
