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
public class factory_IS 
{
  public staff getsalary(String IS) 
  {
    if(IS==null)
          return null;
      else if(IS.equalsIgnoreCase("TeachingAssistant_is"))
          return new TeachingAssistant_IS();
      else if(IS.equalsIgnoreCase("DOCTOR_IS"))
          return new doctor_is();
      return null;
  }
    
}
