/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo_design_pattern;

import java.util.Scanner;

/**
 *
 * @author messi
 */
public class Demo_design_pattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("enter factory");
        String str=input.nextLine();
        
        factory_CS f1=new factory_CS();
        staff s1=f1.getsalary(str);
        s1.serdata("mohammed", 2, 21, 3360, 12);
        s1.getsalary();
        s1.getyearsOFwork();
        s1.printDATA();
        
        factory_IS f2=new factory_IS();
        staff s2=f2.getsalary(str);
        s2.serdata("asraf", 3, 36, 6000, 33);
        s2.getsalary();
        s2.getyearsOFwork();
        s2.printDATA();
        
        factory_IT f3=new factory_IT();
        staff s3=f2.getsalary(str);
        s3.serdata("ali", 5, 42, 6452, 14);
        s3.getsalary();
        s3.getyearsOFwork();
        s3.printDATA();
        
        
        
    }
    
}
