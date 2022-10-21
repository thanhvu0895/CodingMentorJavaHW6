package codingmentor.java.buoi5homework;

public class PointSheet {
	private int studentId;
	private int subjectId;
	private int semesterId;
	private int examId;
	private double point;
	
	public PointSheet() {
		// TODO Auto-generated constructor stub
	}

	public PointSheet(int studentId, int subjectId, int semesterId, int examId, double point) {
		super();
		this.studentId = studentId;
		this.subjectId = subjectId;
		this.semesterId = semesterId;
		this.examId = examId;
		this.point = point;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public int getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}

	public int getSemesterId() {
		return semesterId;
	}

	public void setSemesterId(int semesterId) {
		this.semesterId = semesterId;
	}

	public int getExamId() {
		return examId;
	}

	public void setExamId(int examId) {
		this.examId = examId;
	}

	public double getPoint() {
		return point;
	}

	public void setPoint(double point) {
		this.point = point;
	}	
	
}
