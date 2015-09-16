/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;


/**
 *
 * @author L115Student
 */
public class StartUp {
    public static void main(String[] args) {
        
        
        AdvancedJavaCourse courseA = new AdvancedJavaCourse("Advanced Java","10050", "Intro to Java", 4.0);
        IntroJavaCourse courseB = new IntroJavaCourse("Intro to Java","10040" ,"Intro to Programming", 2.0);
        IntroToProgrammingCourse courseC = new IntroToProgrammingCourse("Intro To Programming","10040", null, 2.0);
        
        System.out.println("Course Name " + courseA.getCourseName() + " Course Number " + courseA.getCourseNumber());
        System.out.println("Course Name " + courseB.getCourseName() + " Course Number " + courseB.getCourseNumber());
        System.out.println("Course Name " + courseC.getCourseName() + " Course Number " + courseC.getCourseNumber());
        
        
        // This inheirtance has the postive of forced redeclare of the methods due to them coming from an interface
        // but is unable to have concrete getters in the super class casuing additonl work for sub class authors  
    }
    
    
}
