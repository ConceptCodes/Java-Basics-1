package demo1;

public class Student {
	private String firstName = "";
	private String lastName = "";
	private int grade = 0;
	private boolean present;
	
	public Student(String fname, String lname, int grade, boolean present) {
		this.firstName = fname;
		this.lastName = lname;
		this.grade = grade;
		this.present = present;
	}
	
	public void setLastName(String lastname) {  this.lastName = lastname;   }
	
	public void setFirstName(String firstname) {  this.firstName = firstname; }
	
	public void setGrade(int grade) {  this.grade = grade; }
	
	public void isHere() { this.present = true; }
	
	public String getFirstName() {  return (String) firstName;  }
	
	public String getLastName() {  return (String) lastName;  }
	
	public int getGrade() { return grade; }
	
	public String getAttendance() { 
		if(this.present)
			return "Present";
		else 
			return "Absent";
	}
	
	public String toString() {	return "[ Student Name: " + this.getFirstName() + " " + this.getLastName() + " || Grade: " + this.getGrade() +"th || Present: "+ this.getAttendance() +" ]";	}

}
