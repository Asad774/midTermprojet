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
ArrayList<projectList>projectmainlist = new ArrayList<projectList>(); 



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
  
public boolean saveStudents()
  {
    boolean flag = false;
    try{
      FileWriter myWriter = new FileWriter("Students.txt");
      for(int i=0; i<studentlist.size(); i++)
      {
        Students d =(Students)studentlist.get(i);
        myWriter.write(d.getName()+",");
        myWriter.write(d.getID()+",");
        myWriter.write(d.getPassword()+",");
        myWriter.write(d.getSection()+",");
        myWriter.write(d.getsession()+"\n");
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

public boolean loadStudents()
  {
    boolean flag = false; 
    try{
      File myObj = new File("Students.txt");
      Scanner myReader = new Scanner(myObj);
      while(myReader.hasNextLine())
      {
        Students e = new Students();
        String data =myReader.nextLine();
        String [] str = data.split(",");
        e.setName(str[0]);
        e.setID(str[1]);
        e.setPassword(str[2]);
        e.setSection(str[3]);
        e.setsession(str[4]);
        studentlist.add(e);
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
  


public boolean saveAdvisors()
  {
    boolean flag = false;
    try{
      FileWriter myWriter = new FileWriter("Advisors.txt");
      for(int i=0; i<advisorlist.size(); i++)
      {
        Advisors d =(Advisors)advisorlist.get(i);
        myWriter.write(d.getName()+",");
        myWriter.write(d.getID()+",");
        myWriter.write(d.getPassword()+",");
        myWriter.write(d.getDepartment()+",");
        myWriter.write(d.getQualification()+",");
        myWriter.write(d.getPost()+"\n");
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

public boolean loadAdvisors()
  {
    boolean flag = false; 
    try{
      File myObj = new File("Advisors.txt");
      Scanner myReader = new Scanner(myObj);
      while(myReader.hasNextLine())
      {
        Advisors e = new Advisors();
        String data =myReader.nextLine();
        String [] str = data.split(",");
        e.setName(str[0]);
        e.setID(str[1]);
        e.setPassword(str[2]);
        e.setDepartment(str[3]);
        e.setQualification(str[4]);
        e.setPost(str[5]);
        advisorlist.add(e);
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
  



public boolean saveProject()
  {
    boolean flag = false;
    try{
      FileWriter myWriter = new FileWriter("Projects.txt");
      for(int i=0; i<projectmainlist.size(); i++)
      {
        projectList d =(projectList)projectmainlist.get(i);
        myWriter.write(d.getTitle()+",");
        myWriter.write(d.getType()+",");
        myWriter.write(d.getoption()+",");
        myWriter.write(d.Advisors[0]+",");
        myWriter.write(d.Advisors[1]+",");
        myWriter.write(d.Advisors[2]+"\n");
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

public boolean loadProject()
  {
    boolean flag = false; 
    try{
      File myObj = new File("Projects.txt");
      Scanner myReader = new Scanner(myObj);
      while(myReader.hasNextLine())
      {
       projectList e = new projectList();
        String data =myReader.nextLine();
        String [] str = data.split(",");
        e.setTitle(str[0]);
        e.setType(str[1]);
        e.setoption(str[2]);
        e.Advisors[0]=str[3];
        e.Advisors[1]=str[4];
        e.Advisors[2]=str[5];
        projectmainlist.add(e);
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
