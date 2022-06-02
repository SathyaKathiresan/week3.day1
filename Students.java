package week3.day1;

public class Students {
	
	public void getStudentInfo(int id) {
		System.out.println("ID:" +id);
	}
	public void getStudentInfo(int id, String name) {
		System.out.println("ID:" +id + " Name: " + name);
	}
	public void getStudentInfo(String email, String mobNum ) {
		System.out.println("Email:" +email + " Mobile No.: " + mobNum);
	}

	public static void main(String[] args) {
		Students objstu = new Students();
		objstu.getStudentInfo(1001);
		objstu.getStudentInfo(1001, "Sathya");
		objstu.getStudentInfo("sathya@gmail.com", "234567891");

	}

}
