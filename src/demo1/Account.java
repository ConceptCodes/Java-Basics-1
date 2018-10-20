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
		
		Scanner goOn = new Scanner(System.in);
		System.out.println("Do you want to continue: ");
		System.out.print("> ");
		String choice = null;
		if(goOn.hasNext()) {
			choice = goOn.next();		
			if(choice == "yes") {	
				System.out.println("[ " + Physics.getName()+" Class ]");
				Scanner phyReader = new Scanner(System.in);
				Physics.takeAttendance(phyReader);
			
				// Log Both Reports
				System.out.println(Biology.logReport());
				System.out.println(Physics.logReport());
			} else if(choice == "no") {
			
			// Log Biology Report Alone
			System.out.println(Biology.logReport());
		} 
		
		goOn.close();
	}
  }
}
