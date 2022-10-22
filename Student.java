package codingmentor.java.buoi5homework;

public class Student {
	private int id;
	private String name;
	private int classId;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String name, int classId) {
		super();
		this.id = id;
		this.name = name;
		this.classId = classId;
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
	
	
	public int getClassId() {
		return classId;
	}

	public void setClassId(int classId) {
		this.classId = classId;
	}


	
	
	
}
