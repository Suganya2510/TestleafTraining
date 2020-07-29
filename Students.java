package week3.day2;

public class Students {
	
	public void getstudentInfo(int id) {
		
	System.out.println("Student Details for id");	

	}
   
	public void getstudentInfo(int id, String name) {
		
		System.out.println("Student Details for id and name");	

		}
	
    public void getstudentInfo(String email, long phone) {
		
		System.out.println("Student Details for email and phone");	

		}
	
	public static void main(String[] args) {
		 
		Students stud = new Students();
		
		stud.getstudentInfo(50);
		stud.getstudentInfo(100, "Shash");
		stud.getstudentInfo("shashvika@gmail.com", 9962669666l);
	
		
		

	}

}
