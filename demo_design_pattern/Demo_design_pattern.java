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
        System.out.println("enter desierd member");
        String str=input.nextLine();
        factory f = new factory ();
        staff s=f.getstaff(str);
        s.getsalary();
        s.getyearsOFwork();
        s.serdata("mohammed", 5, 21, 3000);
        s.printDATA();
        
        
    }
    
}
