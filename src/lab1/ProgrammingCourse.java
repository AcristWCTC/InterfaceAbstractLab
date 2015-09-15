/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author acrist
 */
public abstract class ProgrammingCourse {
    
    private String courseNumber;
    private String courseName;
    private double credits;
    private String prerequisites;
    
    

    public final String getCourseNumber(){
        return courseNumber;
    }

    public final String getCourseName(){
        return courseName;
    };

    public final double getCredits(){
        return credits;
    };
    public final String getPrerequisites(){
        return prerequisites;
    };

    public abstract void setCourseNumber(String courseNumber);

    public abstract void setPrerequisites(String prerequisites);

    public abstract void setCourseName(String courseName);

    public abstract void setCredits(double credits);

}
