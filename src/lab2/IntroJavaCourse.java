package lab2;

import lab1.*;
import javax.swing.JOptionPane;

/**
 * Describe responsibilities here.
 *
 * @author your name goes here
 * @version 1.00
 */
public class IntroJavaCourse implements ProgrammingCourse{

    String courseName;
    private String courseNumber;
    private double credits;
    private String prerequisites;

    public IntroJavaCourse(String courseName, String courseNumber, double credits, String prerequisites) {
        this.courseName = courseName;
        this.courseNumber = courseNumber;
        this.credits = credits;
        this.prerequisites = prerequisites;
    }


    public final void setCourseNumber(String courseNumber) {
        if (courseNumber == null || courseNumber.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseNumber cannot be null of empty string");
            System.exit(0);
        }
        this.courseNumber = courseNumber;

    }

    public final void setPrerequisites(String prerequisites) {
        if (prerequisites.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: prerequisites cannot be null of empty string");
            System.exit(0);
        }
        this.prerequisites = prerequisites;
    }

    public final void setCredits(double credits) {
        if (credits < 0 || credits > 5.0) {
            System.out.println(
                    "Error: credits must be in the range 0.5 to 4.0");
            System.exit(0);
        }
        this.credits = credits;
    }

    public final void setCourseName(String courseName) {
        if (courseName == null || courseName.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseName cannot be null of empty string");
            System.exit(0);
        }
        this.courseName = courseName;
    }

    public final String getCourseName() {
       return courseName;
    }

    public final String getCourseNumber() {
        return courseNumber;
    }

    public final double getCredits() {
        return credits;
    }

    public final String getPrerequisites() {
        return prerequisites;
    }

}
