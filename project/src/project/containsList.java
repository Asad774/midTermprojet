/*
 This is the class containing all lists
 */
package project;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author muzammal computer
 */
public class containsList {
private static containsList smpl = null;
private containsList(){
    
}

public static containsList getInstance(){
if(smpl == null){
smpl = new containsList();
return smpl;
}
return smpl;
}


ArrayList<CommitteeMembers>committeelist = new ArrayList<CommitteeMembers>();   
ArrayList<Students>studentlist = new ArrayList<Students>(); 
ArrayList<Students>UNIstudentlist = new ArrayList<Students>();
ArrayList<Assessments>assessmentlist = new ArrayList<Assessments>(); 
ArrayList<Advisors>advisorlist = new ArrayList<Advisors>();  



public boolean saveMembers()
  {
    boolean flag = false;
    try{
      FileWriter myWriter = new FileWriter("Members.txt");
      for(int i=0; i<committeelist.size(); i++)
      {
        CommitteeMembers d =(CommitteeMembers)committeelist.get(i);
        myWriter.write(d.getName()+",");
        myWriter.write(d.getID()+",");
        myWriter.write(d.getPassword()+"\n");
      }
      
      myWriter.close();
      flag = true;
    }
    catch(IOException e){
      System.out.println("an error occured");
      flag = false;
    }
    
    return flag;
  }

public boolean loadMembers()
  {
    boolean flag = false; 
    try{
      File myObj = new File("Members.txt");
      Scanner myReader = new Scanner(myObj);
      while(myReader.hasNextLine())
      {
        CommitteeMembers e = new CommitteeMembers();
        String data =myReader.nextLine();
        String [] str = data.split(",");
        e.setName(str[0]);
        e.setID(str[1]);
        e.setPassword(str[2]);
        committeelist.add(e);
      }
      myReader.close();
      
    }
    catch(FileNotFoundException ex)
    {
      System.out.println("an error occured");
      flag = false;
    }
    return flag;
  }
  

public boolean loadUNIStudents()
  {
    boolean flag = false; 
    try{
      File myObj = new File("UNIStudents.txt");
      Scanner myReader = new Scanner(myObj);
      while(myReader.hasNextLine())
      {
        Students e = new Students();
        String data =myReader.nextLine();
        String [] str = data.split(",");
        e.setName(str[0]);
        e.setID(str[1]);
        e.setSection(str[2]);
        UNIstudentlist.add(e);
      }
      myReader.close();
      
    }
    catch(FileNotFoundException ex)
    {
      System.out.println("an error occured");
      flag = false;
    }
    return flag;
  }
  

}
