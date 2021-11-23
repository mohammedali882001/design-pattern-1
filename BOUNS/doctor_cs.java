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
public class doctor_cs implements staff
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
        System.out.println("salary is 3306");
    }

    @Override
    public void getyearsOFwork() 
    {
        System.out.println("yearsOFwork is 24");
    }

    @Override
    public void printDATA() 
    {
        System.out.println("doctor of cs name is "  + name + "doctor of cs id is  " + id +  "doctor of cs age is  "  + age + "doctor of cs salary is " + salary + "doctor of cs   yearsOFwork IS " + yearsOFwork);
    }
    
}
