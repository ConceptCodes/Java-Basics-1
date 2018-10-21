package demo1;

import java.util.*;

public class Classroom {
	private ArrayList<Student> classroom = new ArrayList<Student>();
	private String classroomName;
	private Teacher teacher;
	
	Classroom(Teacher teacher, String className) { this.classroomName = className; this.teacher = teacher; }
	
	// Setter Methods
	public void setName(String name) { this.classroomName = name; }
	
	public void setTeacher(Teacher teacher) { this.teacher =  teacher;}
	
	
	// Getter Methods
	public String getName() { return classroomName; }
	
	public int getClassroomSize() { return classroom.size(); }
	
	public ArrayList<Student> getClassroom() {  return classroom;  }
	
	public Student getStudent(int index) { return classroom.get(index); }
	
	public Teacher getTeacher() { return teacher; }
	
	
	// Helper Functions
	public void addStudent(Student newStudent) {  this.classroom.add(newStudent);	}
	
	public void takeAttendance(Scanner input) { 
		for(Student currentChild: this.getClassroom()) {
			System.out.println("Is " + currentChild.getFirstName() + " present in " + this.getName() + " today ( [0] = yes ): ");
			System.out.print("> ");
			int n = input.nextInt();
			if(n == 0) 
				currentChild.isHere();  
		}
	}
		
	public String logReport() {
		String log = "";
		for(Student child: this.classroom) 
			log += (String) child.toString() + "\n";
		return log;
	}
	
}
