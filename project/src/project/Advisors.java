/*
This is the advisors information class
*/
package project;

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
   
}
