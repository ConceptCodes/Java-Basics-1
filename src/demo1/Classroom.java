package demo1;

import java.util.*;

public class Classroom {
	private ArrayList<Student> classroom = new ArrayList<Student>();
	private String classroomName;
	
	Classroom(String className) { this.setName(className); }
	
	public String getName() { return classroomName; }
	
	public int getClassroomSize() { return this.classroom.size(); }
	
	public ArrayList<Student> getClassroom() {  return classroom;  }
	
	public void setName(String name) { this.classroomName = name; }
	
	public void addStudent(Student newStudent) {  this.classroom.add(newStudent);	}
	
	public Student getStudent(int index) { return this.classroom.get(index); }
	
	public void takeAttendance(Scanner input) { 
		for(Student currentChild: this.getClassroom()) {
			System.out.println("Is " + currentChild.getFirstName() + " present in " + this.getName() + " today ([0] = yes / [1] = no): ");
			System.out.print("> ");
			int n = input.nextInt();
			if(n == 0) 
				currentChild.isHere();  
		}
		input.close();
	}
		
	public String logReport() {
		String log = "";
		for(Student child: this.classroom) 
			log += (String) child.toString() + "\n";
		return log;
	}
}
