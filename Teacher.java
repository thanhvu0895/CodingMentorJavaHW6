package codingmentor.java.buoi5homework;

public class Teacher {
	private int id;
	private String name;
	private char isPrimaryTeacher;
	
	public Teacher() {
		// TODO Auto-generated constructor stub
	}

	public Teacher(int id, String name, char isPrimaryTeacher) {
		super();
		this.id = id;
		this.name = name;
		this.isPrimaryTeacher = isPrimaryTeacher;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getIsPrimaryTeacher() {
		return isPrimaryTeacher;
	}

	public void setIsPrimaryTeacher(char isPrimaryTeacher) {
		this.isPrimaryTeacher = isPrimaryTeacher;
	}
}
