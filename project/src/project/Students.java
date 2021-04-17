/*
This is the students information class
*/
package project;

import javax.swing.JOptionPane;

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
    JOptionPane.showMessageDialog(null,"Student is added","Alhammdulilah",3);
}


public boolean matchStudent(String s)
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

}
