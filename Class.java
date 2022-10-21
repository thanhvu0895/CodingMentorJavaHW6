package codingmentor.java.buoi5homework;

public class Class {
	private int id;
	private String name;
	private int roomLocationId;
	private int primaryTeacherId;
	
	public Class() {
		// TODO Auto-generated constructor stub
	}

	
	public Class(int id, String name, int roomLocationId) {
		super();
		this.id = id;
		this.name = name;
		this.roomLocationId = roomLocationId;
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


	public int getRoomLocationId() {
		return roomLocationId;
	}


	public void setRoomLocationId(int roomLocationId) {
		this.roomLocationId = roomLocationId;
	}


	public int getPrimaryTeacherId() {
		return primaryTeacherId;
	}


	public void setPrimaryTeacherId(int primaryTeacherId) {
		this.primaryTeacherId = primaryTeacherId;
	}

}
