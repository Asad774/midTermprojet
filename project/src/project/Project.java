/*
This is the main driver class
*/
package project;

import java.io.File;

/**
 *
 * @author muzammal computer
 */
public class Project {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        containsList r =containsList.getInstance();
        r.loadMembers();
        r.loadUNIStudents();
        frame1 s = new frame1();
        s.setVisible(true);
    }
    
}
