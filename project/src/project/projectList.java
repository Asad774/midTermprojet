/*
This is the projects information class
*/
package project;

import javax.swing.JOptionPane;

/**
 *
 * @author muzammal computer
 */
public class projectList {
private String Title;
String[] Advisors = new String[3]; 
private String Type;
private String option;

public void setTitle(String s)
{
    Title=s;
}
public void setType(String s)
{
    Type=s;
}
public void setoption(String s)
{
    option=s;
}

public String getTitle()
{
    return Title;
}
public String getType()
{
    return Type;
}
public String getoption()
{
    return option;
}


public boolean matchProject(String s)
{
    boolean flag=false;
    containsList t = containsList.getInstance();
    for(int i=0; i<t.projectmainlist.size(); i++)
      {
        projectList f =(projectList)t.projectmainlist.get(i);
        if(s.equals(f.getTitle()))
        {
            flag=true;
        }
      } 
    return flag;
}


public void addproject(projectList e)
{
    containsList t =containsList.getInstance();
    t.projectmainlist.add(e);
    
    JOptionPane.showMessageDialog(null,"Project is added","confirmation",3);
    t.saveProject();
}

public void deleteProject(String s)
{
  containsList t = containsList.getInstance();
    for(int i=0; i<t.projectmainlist.size(); i++)
      {
        projectList f =(projectList)t.projectmainlist.get(i);
        if(s.equals(f.getTitle()))
        {
         t.projectmainlist.remove(i);
         t.saveProject();
         JOptionPane.showMessageDialog(null,"Project is deleted","confirmation",3);
        }
      }   
}


public void updateProject(String s , projectList e)
{
  containsList t = containsList.getInstance();
    for(int i=0; i<t.projectmainlist.size(); i++)
      {
        projectList f =(projectList)t.projectmainlist.get(i);
        if(s.equals(f.getTitle()))
        {
         t.projectmainlist.set(i,e);
         t.saveProject();
         JOptionPane.showMessageDialog(null,"Project is updated","confirmation",3);
        }
     }   
}

}
