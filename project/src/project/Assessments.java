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
private String deadline;

static int questionNo =10;
static int check=0;
static String[] que= new String[10]; 

public void setTitle(String s)
{
    Title=s;
}
public void setTotalMarks(int s)
{
    TotalMarks=s;
}
public void setdeadline(String s)
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
public String getdeadline()
{
    return deadline;
}



public boolean matchAssessments(String s)
{
    boolean flag =false;
    containsList t = containsList.getInstance();
    for(int i=0; i<t.assessmentlist.size(); i++)
      {
         Assessments f =( Assessments)t.assessmentlist.get(i);
        if(s.equals(f.getTitle()))
        {
         flag=true;
         
        }
      } 
    return flag;
}

public void copyKar(int b, String str[])
{
 for(int i=0; i<b ; i++)
 {
   que[i]=str[i];
   questionNo=b;
 }
}

public void good(Assessments a)
{ 
 for(int i=0; i<questionNo ; i++)
 {
   a.Questions[i]=que[i];
 }
 
}

}
