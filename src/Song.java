public class Song {
	String title;
	int id;
	String date;
	float last;
	String gender;
	String portRait;
	String description;	
	
	
	public Song(String title, int id, String date, float last, String gender, String portRait, String description) {
		super();
		this.title = title;
		this.id = id;
		this.date = date;
		this.last = last;
		this.gender = gender;
		this.portRait = portRait;
		this.description = description;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public float getLast() {
		return last;
	}
	public void setLast(float last) {
		this.last = last;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPortRait() {
		return portRait;
	}
	public void setPortRait(String portRait) {
		this.portRait = portRait;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

}
