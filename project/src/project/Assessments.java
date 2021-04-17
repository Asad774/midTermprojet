/*
This is the assessments information class
*/
package project;

import java.util.Date;

/**
 *
 * @author muzammal computer
 */
public class Assessments extends Rubrics{
private String Title;
private int TotalMarks;
private Date deadline;

public void setTitle(String s)
{
    Title=s;
}
public void setTotalMarks(int s)
{
    TotalMarks=s;
}
public void setdeadline(Date s)
{
    deadline=s;
}

public String getTitle()
{
    return Title;
}
public int getTotalMarks()
{
    return TotalMarks;
}
public Date getdeadline()
{
    return deadline;
}

}
