/*
this is the basic information class
*/
package project;

/**
 *
 * @author muzammal computer
 */
public class Info {
private String Name; 
private String ID;
private String Password;


public void setName(String s)
{
  Name=s;   
}

public void setID(String s)
{
  ID=s;   
}

public void setPassword(String s)
{
  Password=s;  
}

public String getName()
{
  return Name;   
}

public String getID()
{
  return ID;   
}

public String getPassword()
{
  return Password;   
}

}
