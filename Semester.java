package codingmentor.java.buoi5homework;

public class Semester {
	private int id;
	private String name;
	private int multiplication;
	private int schoolYearId;
	
	public Semester() {
		// TODO Auto-generated constructor stub
	}


	public Semester(int id, String name, int multiplication) {
		super();
		this.id = id;
		this.name = name;
		this.multiplication = multiplication;
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

	public int getSchoolYearId() {
		return schoolYearId;
	}

	public void setSchoolYearId(int schoolYearId) {
		this.schoolYearId = schoolYearId;
	}

	public int getMultiplication() {
		return multiplication;
	}

	public void setMultiplication(int multiplication) {
		this.multiplication = multiplication;
	}
	
}
