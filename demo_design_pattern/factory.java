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
public class factory 
{
    public staff getstaff(String desired_member)
    {
      if(desired_member==null)
             return null;
          else if (desired_member.equalsIgnoreCase("DOCTOR"))
             return new doctor();
      
          else if (desired_member.equalsIgnoreCase("TEACHINGASSISTANT"))
              return new TeachingAssistant();
      return null;
    
    }

  
}
