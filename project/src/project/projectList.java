/*
This is the projects information class
*/
package project;

/**
 *
 * @author muzammal computer
 */
public class projectList {
private String Title;
String[] Advisors = new String[3]; 
private String Type;
private String Link;

public void setTitle(String s)
{
    Title=s;
}
public void setType(String s)
{
    Type=s;
}
public void setLink(String s)
{
    Link=s;
}

public String getTitle()
{
    return Title;
}
public String getType()
{
    return Type;
}
public String getLink()
{
    return Link;
}

}
