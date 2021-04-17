/*
This is the rubrics information class
*/
package project;

import java.util.ArrayList;

/**
 *
 * @author muzammal computer
 */
public class Rubrics {
private int noOfQue;  
String[] Questions = new String[noOfQue];
String[][] Options = new String[noOfQue][3];

public void setOptions(String[][] Options, int l)
{
     Options[l][0]="Good";
     Options[l][1]="Average";
     Options[l][2]="Bad";
}

}
