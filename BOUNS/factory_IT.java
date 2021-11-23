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
public class factory_IT
{
     public staff getsalary(String IT)
    {
      if(IT==null)
          return null;
      else if(IT.equalsIgnoreCase("TeachingAssistant_IT"))
          return new TeachingAssistant_CS();
      else if(IT.equalsIgnoreCase("DOCTOR_IT"))
          return new doctor_is();
      return null;
    
    
    }
}
