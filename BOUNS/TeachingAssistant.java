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
public class TeachingAssistant implements staff
{

    String name;
    int id;
    int age;
    double salary;
    int yearsOFwork;

    

    

    
    
    
    @Override
    public void getsalary()
    {
        System.out.println("salay is 100");
    }

    @Override
    public void getyearsOFwork() 
    {
        System.out.println("years of work is 23");
    }
    
    @Override
    public void printDATA()
    {
      
        System.out.println(" TeachingAssistant_name is  "  + name);
        System.out.println(" TeachingAssistant_id is  "  + id);
        System.out.println(" TeachingAssistant_ age  is    "  + age);
        System.out.println(" TeachingAssistant_salary is  "  + salary);
        System.out.println(" TeachingAssistant_yearsOFwork is  "  + yearsOFwork);
    
    }
    

    @Override
    public void serdata(String name, int id, int age, double salary , int yearsOFwork)
    {
        this.name=name;
        this.id=id;
        this.age=age;
        this.salary=salary;
        this.yearsOFwork=yearsOFwork;
    }
    
}
