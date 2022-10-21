package codingmentor.java.buoi5homework;

public class TeachingProfile {
	private int teacherId;
	private int subjectId;
	
	public TeachingProfile() {
		// TODO Auto-generated constructor stub
	}
	
	public TeachingProfile(int teacherId, int subjectId) {
		super();
		this.teacherId = teacherId;
		this.subjectId = subjectId;
	}

	public int getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}

	public int getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}
}
