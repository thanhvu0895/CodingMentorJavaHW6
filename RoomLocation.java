package codingmentor.java.buoi5homework;

public class RoomLocation {
	private int id;
	private String location;
	 
	public RoomLocation() {
		// TODO Auto-generated constructor stub
	}

	public RoomLocation(int id, String location) {
		super();
		this.id = id;
		this.location = location;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
}
