package demo1;

public class Student extends Person {
	private boolean present = false;
	
	public Student(String fname, String lname, int age, String race, int grade, boolean present) {
		super(fname, lname, age, race, grade);
		this.present = present;
	}
	
	// Setter Methods
	public void setLastName(String lastname) {  super.setlastName(lastname);  }
	
	public void setFirstName(String firstname) {  super.setFirstName(firstname); }
	
	public void setGrade(int grade) { super.setGradeLevel(grade); }
	
	public void setAge(int age) { super.setAge(age); }
	
	public void setRace(String colour) { super.setRace(colour); }
	
	public void isHere() { this.present = true; }
	
	// Getter Methods
	public String getFirstName() {  return (String) super.getFirstName();  }
	
	public String getLastName() {  return (String) super.getLastName();  }
	
	public String getFullName() { return (String) super.getFullName(); }
	
	public int getGrade() { return super.getGradeLevel(); }
	
	public int getAge() { return super.getAge(); }
	
	public String getRace() { return super.getRace(); }
	
	public String getAttendance() { 
		if(this.present)
			return "Present";
		else 
			return "Absent";
	}
	
	public String toString() {	return "[ Student Name: " + this.getFullName() + " || Grade: " + this.getGrade() +"th || Age: "+ this.getAge() +" || Race: "+ this.getRace() +" || Present: "+ this.getAttendance() +" ]";	}
}
