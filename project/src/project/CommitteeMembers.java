/*
This is the committee class and contains all lists
*/
package project;

import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;


class userData{
 public String name;
 public String ID;
 public String Password;
 
 public userData(String fname, String fID, String fPassword){
 this.name = fname;
 this.ID = fID;
 this.Password = fPassword;
 }
 }

/**
 *
 * @author muzammal computer
 */
public class CommitteeMembers extends Info{
    
public void addMember(CommitteeMembers c)
{
    containsList t = containsList.getInstance();
    t.committeelist.add(c);
    t.saveMembers();
    JOptionPane.showMessageDialog(null,"Member is added","confirmation",3);
}


public void deleteMember(String s)
{
    containsList t = containsList.getInstance();
    for(int i=1; i<t.committeelist.size(); i++)
      {
        CommitteeMembers f =(CommitteeMembers)t.committeelist.get(i);
        if(s.equals(f.getID()))
        {
         t.committeelist.remove(i);
         t.saveMembers();
         JOptionPane.showMessageDialog(null,"Member is deleted","confirmation",3);
        }
      }    
}


public void updateMember(String s,CommitteeMembers a)
{
    containsList t = containsList.getInstance();
    for(int i=1; i<t.committeelist.size(); i++)
      {
        CommitteeMembers f =(CommitteeMembers)t.committeelist.get(i);
        if(s.equals(f.getID()))
        {
         t.committeelist.set(i,a); 
         t.saveMembers();
         JOptionPane.showMessageDialog(null,"Member is updated","confirmation",3);
        }
      }    
}


public boolean matchMember(String s)
{
    boolean flag=false;
    containsList t = containsList.getInstance();
    for(int i=0; i<t.committeelist.size(); i++)
      {
        CommitteeMembers f =(CommitteeMembers)t.committeelist.get(i);
        if(s.equals(f.getID()))
        {
         flag=true;
         
        }
      } 
    return flag;
    
}


public boolean matchPassword(String s)
{
    boolean flag=false;
    containsList t = containsList.getInstance();
    for(int i=0; i<t.committeelist.size(); i++)
      {
        CommitteeMembers f =(CommitteeMembers)t.committeelist.get(i);
        if(s.equals(f.getPassword()))
        {
         flag=true;
         
        }
      } 
    return flag;
    
}

public boolean matchHeadMember(String s)
{
    boolean flag=false;
    containsList t = containsList.getInstance();
        CommitteeMembers f =(CommitteeMembers)t.committeelist.get(0);
        if(s.equals(f.getID()))
        {
         flag=true;
         
        }
    return flag;
    
}


public boolean matchHeadPassword(String s)
{
    boolean flag=false;
    containsList t = containsList.getInstance();
        CommitteeMembers f =(CommitteeMembers)t.committeelist.get(0);
        if(s.equals(f.getPassword()))
        {
         flag=true;
         
        } 
    return flag;
    
}


}