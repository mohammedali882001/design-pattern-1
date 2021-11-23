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
public class doctor implements staff
{
    String name;
    int id;
    int age;
    double salary;

    @Override
    public void getsalary()
    {
        System.out.println("salary is 255");
    }

    @Override
    public void getyearsOFwork() 
    {
        System.out.println("years of work is 15 ");
    }

    @Override
    public void serdata(String name, int id, int age, double salary) 
    {
       this.name=name;
        this.id=id;
        this.age=age;
        this.salary=salary;
        
    }

    @Override
    public void printDATA()
    {
        System.out.println("doctor_name is "  + name);
        System.out.println("doctor_id is "  + id);
        System.out.println("doctor_age is "  + age);
        System.out.println("doctor_salary is "  + salary);
    }

    
}
