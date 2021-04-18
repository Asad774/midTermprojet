/*
This is the advisors information class
*/
package project;

import javax.swing.JOptionPane;


class advisorData{
 public String Name;
 public String ID;
 public String department;
 public String qualification;
 
 public advisorData(String fname, String fID, String fsection, String fsession){
 this.Name = fname;
 this.ID = fID;
 this.department=fsection;
 this.qualification=fsession;
 }
 }

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
    JOptionPane.showMessageDialog(null,"Advisor is added","confirmation",3);
}

public void deleteAdvisor(String s)
{
    containsList t = containsList.getInstance();
    for(int i=0; i<t.advisorlist.size(); i++)
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


public void updateAdvisor(String s , Advisors d)
{
    containsList t = containsList.getInstance();
    for(int i=0; i<t.advisorlist.size(); i++)
      {
        Advisors f =(Advisors)t.advisorlist.get(i);
        if(s.equals(f.getID()))
        {
         t.advisorlist.set(i , d);
         t.saveAdvisors();
         JOptionPane.showMessageDialog(null,"Advisor is updated","confirmation",3);
        }
      }    
}


public boolean matchAdvisor(String s)
{
    boolean flag=false;
    containsList t = containsList.getInstance();
    for(int i=0; i<t.advisorlist.size(); i++)
      {
        Advisors f =(Advisors)t.advisorlist.get(i);
        if(s.equals(f.getID()))
        {
            flag=true;
        }
      } 
    return flag;
}


}
