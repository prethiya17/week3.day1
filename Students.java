package week3.day1;

public class Students {
	
	public void getStudentInfo(int id) {
		System.out.println("Entering into Single Arg method");
		System.out.println("StudentId:"+" "+id);
		
	}
	
	public void getStudentInfo(int id,String Name) {
		System.out.println("Entering into id & name method");
		System.out.println("StudentId:"+" "+id+" "+"Name of the Student"+" "+Name);
	}
	
	public void getStudentInfo(String email,long pnum) {
		System.out.println("Entering into email &phonenum method");
		System.out.println("Email:"+email+" "+"Phone Number of Student:"+pnum);
	}

	/*public void getStudentInfo(String email,int pnum) {
		System.out.println("Entering into email &phonenum method");
	}*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students st=new Students();
		st.getStudentInfo(8007);
		st.getStudentInfo(8000, "Prethiya");
		//st.getStudentInfo(null, );
		st.getStudentInfo("axy@g.com", 9886798076L);
		//st.getStudentInfo(null, 9886798076);
	   // st.getStudentInfo("axy@g.com",9886798076);

	}

}
