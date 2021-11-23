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
public class factory_CS
{
 
    public staff getsalary(String CS)
    {
      if(CS==null)
          return null;
      else if(CS.equalsIgnoreCase("TeachingAssistant_CS"))
          return new TeachingAssistant_CS();
      else if(CS.equalsIgnoreCase("DOCTOR_CS"))
          return new doctor_cs();
      return null;
    
    
    }
}
