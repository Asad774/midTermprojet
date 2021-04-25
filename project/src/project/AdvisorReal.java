/*
This is the advisors menu class
*/

package project;

/**
 *
 * @author muzammal computer
 */
public class AdvisorReal {
static String adv;   

public String getRealName(String s)
{
    String a = "asad";
    containsList t = containsList.getInstance();
    for(int i=0; i<t.advisorlist.size(); i++)
      {
        Advisors f =(Advisors)t.advisorlist.get(i);
        if(s.equals(f.getID()))
        {
         a=f.getName();
        }
      } 
    return a;
}

}
