package codingmentor.java.buoi5homework;

public class Subject {
	private int id;
	private String name;
	private int multiplication;
	
	public Subject() {
		// TODO Auto-generated constructor stub
	}

	public Subject(int id, String name, int multiplication) {
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

	public int getMultiplication() {
		return multiplication;
	}

	public void setMultiplication(int multiplication) {
		this.multiplication = multiplication;
	}	
}
