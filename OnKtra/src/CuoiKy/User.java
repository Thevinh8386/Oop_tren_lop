package CuoiKy;

public abstract class User {
	protected int user_id;
	protected String user_name;
	protected String user_fullname;
	protected float user_cosalary;
	public abstract double getSalary();
	
	//Constructor
	public User() {}
	
	public User(int user_id, String user_name, String user_fullname, float user_cosalary) {
		this.user_id = user_id;
		this.user_name = user_name;
		this.user_fullname = user_fullname;
		this.user_cosalary = user_cosalary;
	}

	//Getter method
	public int getUser_id() {
		return user_id;
	}

	public String getUser_name() {
		return user_name;
	}

	public String getUser_fullname() {
		return user_fullname;
	}

	public float getUser_cosalary() {
		return user_cosalary;
	}

	//Setter method
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public void setUser_fullname(String user_fullname) {
		this.user_fullname = user_fullname;
	}

	public void setUser_cosalary(float user_cosalary) {
		this.user_cosalary = user_cosalary;
	}

	//Method
	@Override
	public String toString() {
		return "User [ID: " + user_id + ", Name: " + user_name + ", Full name: " + user_fullname
				+ ", Hệ số lương: " + user_cosalary + ", ";
	}
}
