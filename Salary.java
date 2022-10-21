package codingmentor.java.buoi5homework;

public class Salary {
	private int id;
	private int teacherId;
	private double totalWage;
	
	public Salary() {
		// TODO Auto-generated constructor stub
	}

	public Salary(int id, int teacherId, double totalWage) {
		super();
		this.id = id;
		this.teacherId = teacherId;
		this.totalWage = totalWage;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}

	public double getTotalWage() {
		return totalWage;
	}

	public void setTotalWage(double totalWage) {
		this.totalWage = totalWage;
	}
}
