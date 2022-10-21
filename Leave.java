package codingmentor.java.buoi5homework;

public class Leave {
	private int id;
	private int teacherId;
	private String LeaveDate;
	
	public Leave() {
		// TODO Auto-generated constructor stub
	}

	public Leave(int id, int teacherId, String leaveDate) {
		super();
		this.id = id;
		this.teacherId = teacherId;
		LeaveDate = leaveDate;
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

	public String getLeaveDate() {
		return LeaveDate;
	}

	public void setLeaveDate(String leaveDate) {
		LeaveDate = leaveDate;
	}
}
