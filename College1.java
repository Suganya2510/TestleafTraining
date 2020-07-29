package week3.day2;

public class College1 extends Department{
	
	public void collegeName() {
		
		System.out.println("Kongu Engineering College");		 

	}
	
    public void collegeCode() {
		
		System.out.println("07EIR051");
		 
	}

    public void collegeRank() {
		
		System.out.println("First");
		 
	}
public static void main(String[] args) {
		
		College1 col = new College1();
		
		col.collegeCode();
		col.collegeName();
		col.collegeRank();
		col.deptName();
		col.studentDept();
		col.studentId();
		col.studentName();
		
		
	}
    
}