package demo1;

public class Person {
	private String firstName = "";
	private String lastName = "";
	private int age = 0;
	private String race = "";
	private int grade = 0;
	
	Person (String fname, String lname, int age, String race, int grade){
		this.firstName = fname;
		this.lastName = lname;
		this.age = age;
		this.race = race;
		this.grade = grade;
	}
	
	// Getter Methods
	public String getFullName() { return (String) firstName +" "+ lastName; }
	
	public String getFirstName() { return (String) firstName; }
	
	public String getLastName() { return (String) lastName; }
	
	public int getAge() { return (int) age; }
	
	public String getRace() { return (String) race; }
	
	public int getGradeLevel() { return (int) grade; }
	
	
	// Setter Methods
	public void setFirstName(String name) { this.firstName = name; }
	
	public void setlastName(String name) { this.lastName = name; }
	
	public void setAge(int age) { this.age = age; }
	
	public void setRace(String race) { this.race = race; }	
	
	public void setGradeLevel(int grade) { if((grade >= 1) & (grade <= 12)) { this.grade = grade; } } 
}
