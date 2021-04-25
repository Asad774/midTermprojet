/*
This is the students information class
*/
package project;

import javax.swing.JOptionPane;

class studentData{
 public String name;
 public String ID;
 public String section;
 public String session;
 
 public studentData(String fname, String fID, String fsection, String fsession){
 this.name = fname;
 this.ID = fID;
 this.section=fsection;
 this.session=fsession;
 }
 }

/**
 *
 * @author muzammal computer
 */
public class Students extends Info{
private String Section; 
private String session;


public void setSection(String s)
{
  Section=s;   
}

public void setsession(String s)
{
  session=s;   
}

public String getSection()
{
  return Section;   
}

public String getsession()
{
  return session;   
}

public void addStudent(Students s)
{
    containsList t =containsList.getInstance();
    t.studentlist.add(s);
    t.saveStudents();
    JOptionPane.showMessageDialog(null,"Student is added","Alhammdulilah",3);
}

public void deleteStudents(String s)
{
    containsList t = containsList.getInstance();
    for(int i=0; i<t.studentlist.size(); i++)
      {
        Students f =(Students)t.studentlist.get(i);
        if(s.equals(f.getID()))
        {
         t.studentlist.remove(i);
         t.saveStudents();
         JOptionPane.showMessageDialog(null,"Member is deleted","confirmation",3);
        }
      }    
}


public void updateStudents(String s, Students u)
{
    containsList t = containsList.getInstance();
    for(int i=0; i<t.studentlist.size(); i++)
      {
        Students f =(Students)t.studentlist.get(i);
        if(s.equals(f.getID()))
        {
         t.studentlist.set(i,u);
         t.saveStudents();
         JOptionPane.showMessageDialog(null,"Member is updated","confirmation",3);
        }
      }    
}


public boolean matchStudent(String s)
{
    boolean flag=false;
    containsList t = containsList.getInstance();
    for(int i=0; i<t.studentlist.size(); i++)
      {
        Students f =(Students)t.studentlist.get(i);
        if(s.equals(f.getID()))
        {
         flag=true;
         
        }
      } 
    return flag;
    
}

public boolean matchRegistration(String s)
{
    boolean flag=false;
    containsList t = containsList.getInstance();
    for(int i=0; i<t.studentlist.size(); i++)
      {
        Students f =(Students)t.studentlist.get(i);
        if(s.equals(f.getPassword()))
        {
         flag=true;
         
        }
      } 
    return flag;
    
}



public boolean matchUNIStudent(String s)
{
    boolean flag=false;
    containsList t = containsList.getInstance();
    for(int i=0; i<t.UNIstudentlist.size(); i++)
      {
        Students f =(Students)t.UNIstudentlist.get(i);
        if(s.equals(f.getID()))
        {
         flag=true;
         
        }
      } 
    return flag;
    
}

public boolean matchUNIRegistration(String s)
{
    boolean flag=false;
    containsList t = containsList.getInstance();
    for(int i=0; i<t.UNIstudentlist.size(); i++)
      {
        Students f =(Students)t.UNIstudentlist.get(i);
        if(s.equals(f.getName()))
        {
         flag=true;
         
        }
      } 
    return flag;
    
}


}
