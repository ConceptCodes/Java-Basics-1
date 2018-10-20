package demo1;

import java.util.*;

public class Account {
	
	public static Classroom class1;
	public static Classroom class2;
	public static School ycp;
	
	public static void main(String[] args) {	
		// Biology Class
		class1 = new Classroom("Biology");
		class1.addStudent(new Student("Elon","Musk",4, false));
		class1.addStudent(new Student("Pharell","Williams",6, false));
		class1.addStudent(new Student("Joyner","Lucas",10, false));
		
		// Physics Class
		class2 = new Classroom("Physics");
		class2.addStudent(new Student("Rick","Sanchez",4, false));
		class2.addStudent(new Student("Ferris","Bueller",6, false));
		class2.addStudent(new Student("Childish","Gambino",10, false));
		
		// School
		ycp = new School("York College of Pennsylvania");
		ycp.addClass(class1);
		ycp.addClass(class2);
		
		Classroom Biology = ycp.getClassroom(0);
		Classroom Physics = ycp.getClassroom(1);
		
		// Take Attendance
		System.out.println("School Name: " + ycp.getName());
		
		System.out.println("[ " + Biology.getName() + " Class ]");
		Scanner bioReader = new Scanner(System.in);
		Biology.takeAttendance(bioReader);
		
		// Log Biology
		System.out.println(Biology.logReport());
		
		// Log Physics 
		System.out.println("[ " + Physics.getName()+" Class ]");
		Scanner phyReader = new Scanner(System.in);
		Physics.takeAttendance(phyReader);
		System.out.println(Physics.logReport());	
	}
}
