/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author L115Student
 */
public class StartUp {
    public static void main(String[] args) {
        
        
        ProgrammingCourse courseA = new AdvancedJavaCourse("Advanced Java","10050", 4.0, "Intro to Java");
        ProgrammingCourse courseB = new IntroJavaCourse("Intro to Java","10030", 2.0 ,"Intro to Programming");
        ProgrammingCourse courseC = new IntroToProgrammingCourse("Intro To Programming","10040", 2.0, null);
        
        System.out.println("Course Name " + courseA.getCourseName() + " Course Number " + courseA.getCourseNumber());
        System.out.println("Course Name " + courseB.getCourseName() + " Course Number " + courseB.getCourseNumber());
        System.out.println("Course Name " + courseC.getCourseName() + " Course Number " + courseC.getCourseNumber());
        
        
        // This inheirtance has the postive of forced redeclare of the methods due to them coming from an interface
        // but is unable to have concrete getters in the super class casuing additonl work for sub class authors  
    }
    
    
}
