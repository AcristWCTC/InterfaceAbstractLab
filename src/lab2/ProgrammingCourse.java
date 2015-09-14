/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author acrist
 */
public interface ProgrammingCourse {
    
    public abstract String getCourseNumber();

    public abstract String getCourseName();

    public abstract double getCredits();

    public abstract String getPrerequisites();

    public abstract void setCourseNumber(String courseNumber);

    public abstract void setPrerequisites(String prerequisites);

    public abstract void setCourseName(String courseName);

    public abstract void setCredits(double credits);
}
