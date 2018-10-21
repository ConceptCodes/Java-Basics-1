package demo1;

public class Teacher extends Person {
	Classroom myClassroom;
	private int roomNumber;
	Teacher(String fname, String lname, int age, String race, int gradeLevel, int roomNumber){
		super(fname, lname, age, race, gradeLevel);
		this.roomNumber = roomNumber;
	}
	
	// Setter Methods
	public void setFirstName(String name) { super.setFirstName(name); }
	
	public void setLastName(String name) { super.setlastName(name); }
	
	public void setAge(int age) { super.setAge(age); }
	
	public void setRace(String color) { super.setRace(color); }
	
	public void setGradeLevel(int grade) { super.setGradeLevel(grade); }
	
	public void setRoomNumber(int number) { this.roomNumber = number; }
	
	public void setClassroom(Classroom room) { this.myClassroom = room; }
	
	
	// Getter Methods
	public String getFirstName() { return super.getFirstName(); }
	
	public String getLastName() { return super.getLastName(); }
	
	public int getAge() { return super.getAge(); }
	
	public String getRace() { return super.getRace(); }
	
	public int getGradeLevel() { return super.getGradeLevel(); }
	
	public int getRoomNumber() { return roomNumber; }
	
	public Classroom getClassroom() { return myClassroom; }
}
