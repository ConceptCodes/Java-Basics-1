package demo1;

import java.util.*;

public class School {
	private String name;
	private ArrayList<Classroom> classes = new ArrayList<Classroom>();
	
	School(String schoolName) {
		this.name = schoolName;
	}
	
	// Setter Methods
	public void setName(String name) {  this.name = name;  }
	
	public void setClasses(ArrayList<Classroom> classes) {  if(classes.size() > 0) { this.classes = classes; } }
	
	
	// Getter Methods
	public String getName() {  return name;  }
	
	public ArrayList<Classroom> getClasses() {  return classes;  }
	
	public int getClassCount() {  return this.classes.size();  }
	
	public Classroom getClassroom(int index) { return this.classes.get(index);  }
	
	//Helper Function
	public void addClass(Classroom newClass) {  this.classes.add(newClass);  }
}
