package codingmentor.java.buoi5homework;

public class PrimaryTeacher {
	private int id;
	private String fullName;
	
	public PrimaryTeacher() {
		// TODO Auto-generated constructor stub
	}

	public PrimaryTeacher(int id, String fullName) {
		super();
		this.id = id;
		this.fullName = fullName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
}
