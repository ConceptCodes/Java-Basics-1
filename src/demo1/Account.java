package demo1;

import java.util.*;

public class Account {
	
	public static Classroom class1, class2;
	public static Teacher David, TayK;
	public static School ycp;
	
	public static void main(String[] args) {	
		//Teachers
		David = new Teacher("David", "Ojo", 19, "Black", 12, 207);
		TayK = new Teacher("Kaelan", "Dowdall", 20, "White", 6, 113);
		
		// Biology Class
		class1 = new Classroom(David, "Biology");
		class1.addStudent(new Student("Elon", "Musk", 40,"White", 10, false));
		class1.addStudent(new Student("Pharell", "Williams", 26, "Mixed", 6, false));
		class1.addStudent(new Student("Joyner", "Lucas", 30, "Mixed", 10, false));
		
		// Physics Class
		class2 = new Classroom(TayK, "Physics");
		class2.addStudent(new Student("Rick", "Sanchez", 23, "White", 4, false));
		class2.addStudent(new Student("Ferris","Bueller",19, "White", 6, false));
		class2.addStudent(new Student("Childish", "Gambino", 27, "Black", 10, false));
		
		// School
		ycp = new School("York College of Pennsylvania");
		ycp.addClass(class1);
		ycp.addClass(class2);
		
		/** Take Attendance **/
		System.out.println("School Name: " + ycp.getName()+"\n");
		
		Scanner userInput = new Scanner(System.in);
		ArrayList<String> log = new ArrayList<String>();
		for(Classroom classroom: ycp.getClasses()) {
			// Log Classes
			System.out.println("[ " + classroom.getName() + " Class ] [ Teacher: "+ classroom.getTeacher().getFullName() +" ]\n");
			classroom.takeAttendance(userInput);
			log.add(classroom.getName());
			log.add(classroom.logReport());
		}
		userInput.close();
		System.out.println("Attendance Over!");
		for(String e: log) { System.out.println(e); }
	}
}
