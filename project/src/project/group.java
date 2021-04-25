/*
This is the groups information class
*/
package project;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author muzammal computer
 */
public class group {
static String stu;    
String[] grouping = new String[5];
private String selectedProject;

public void setselectedProject(String s)
{
 selectedProject=s; 
 containsList t = containsList.getInstance();
    for(int i=0; i<t.projectmainlist.size(); i++)
      {
        projectList f =(projectList)t.projectmainlist.get(i);
        if(s.equals(f.getTitle()))
        {
            f.setoption("NO");
        }
      } 
}

public String getselectedProject()
{
 return selectedProject;   
}

public boolean matchGroup(String s)
{
    boolean flag=false;
    containsList t = containsList.getInstance();
    for(int i=0; i<t.grouplist.size(); i++)
      {
        group f =(group)t.grouplist.get(i);
        for(int j=0; j<5; j++)
        {
           if(s.equals(f.grouping[j]))
           {
            flag=true;
           }  
        }
      }  
return flag;  
}


public void selectProject(String s , String v)
{
    containsList t = containsList.getInstance();
    for(int i=0; i<t.projectmainlist.size(); i++)
      {
        projectList f =(projectList)t.projectmainlist.get(i);
        if(s.equals(f.getTitle()))
        {
            f.setoption("no");
            t.saveProject();
            for(int x=0; i<t.grouplist.size(); i++)
            {
            group u =(group)t.grouplist.get(i);
            for(int j=0; j<5; j++)
            {
            String[] arr = new String[5];
            if(v.equals(u.grouping[j]))
            {
            u.setselectedProject(s);
            studentMenu d= new studentMenu();
            d.setData();
            t.saveGroups();
            }  
            }
            } 
        }
     } 
}


public void showbros(String s)
{
    containsList t = containsList.getInstance();
    for(int i=0; i<t.grouplist.size(); i++)
      {
        group f =(group)t.grouplist.get(i);
        for(int j=0; j<5; j++)
        {
            String[] arr = new String[5];
           if(f.stu.equals(f.grouping[j]))
           {
            arr[0]=f.grouping[0];
            arr[1]=f.grouping[1];
            arr[2]=f.grouping[2];
            arr[3]=f.grouping[3];
            arr[4]=f.grouping[4];
            JOptionPane.showMessageDialog(null, Arrays.toString(arr),"Groups",2);
           }  
        }
      }  
}


public boolean matchProjects(String s)
{
    boolean flag=false;
    containsList t = containsList.getInstance();
    for(int i=0; i<t.grouplist.size(); i++)
      {
        group f =(group)t.grouplist.get(i);
        for(int j=0; j<5; j++)
        {
           if(f.stu.equals(f.grouping[j]))
           {
               if(f.getselectedProject().equals(null))
               {
                flag=true;
               }
           }  
        }
      }  
return flag;  
}

public String doAll(String s)
{
    containsList t = containsList.getInstance();
    String a="asad";
    for(int i=0; i<t.grouplist.size(); i++)
        {
         group f =(group)t.grouplist.get(i);
        for(int j=0; j<5; j++)
        {
           if(s.equals(f.grouping[j]))
           {
            for(int x=0; x<t.projectmainlist.size();x++)
            {
            projectList b =(projectList)t.projectmainlist.get(x);
            if(f.getselectedProject().equals(b.getTitle()))
            {
             a=b.getTitle();
            }
            
           }
            
        }  
           
        }
        
        }
    return a;
}
    
    
}
