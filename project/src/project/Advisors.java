/*
This is the advisors information class
*/
package project;

import javax.swing.JOptionPane;

/**
 *
 * @author muzammal computer
 */
public class Advisors extends Info{
private String Qualification; 
private String Department;
private String Post;


public void setQualification(String s)
{
  Qualification=s;   
}

public void setDepartment(String s)
{
  Department=s;   
}

public void setPost(String s)
{
  Post=s;  
}

public String getQualification()
{
  return Qualification;   
}

public String getDepartment()
{
  return Department;   
}

public String getPost()
{
  return Post;   
}

public void addAdvisor(Advisors e)
{
    containsList t =containsList.getInstance();
    t.advisorlist.add(e);
    t.saveAdvisors();
}

public void deleteAdvisor(String s)
{
    containsList t = containsList.getInstance();
    for(int i=1; i<t.advisorlist.size(); i++)
      {
        Advisors f =(Advisors)t.advisorlist.get(i);
        if(s.equals(f.getID()))
        {
         t.advisorlist.remove(i);
         t.saveAdvisors();
         JOptionPane.showMessageDialog(null,"Advisor is deleted","confirmation",3);
        }
      }    
}


}
