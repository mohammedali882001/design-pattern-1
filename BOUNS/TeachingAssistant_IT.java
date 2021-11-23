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
public class TeachingAssistant_IT implements staff
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
        System.out.println("salary is 6952");
    }

    @Override
    public void getyearsOFwork()
    {
        System.out.println("yearsOFwork is 51");
    }

    @Override
    public void printDATA()
    {
       System.out.println("TeachingAssistant_IT  name is "  + name + "TeachingAssistant_IT id is  " + id +  "TeachingAssistant_IT age is  "  + age + "TeachingAssistant_IT salary is " + salary + "TeachingAssistant_IT yearsOFwork " + yearsOFwork);
    }
}
