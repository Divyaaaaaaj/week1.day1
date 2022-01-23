package week1.day1;

public class Student {
	
	static String name ="Divya";
	byte rollNumber=1;
	
	
	
	public void College()
	
	{
		String name ="Divya";
		byte rollNumber=1;
		String CollegeName="VRSEC";
		System.out.println("CollegeName:"+CollegeName);
		
	}
	public static void main(String[] args) {
		Student s1=new Student();
		System.out.println("Name is:"+ name);
		s1.College();
		
	}
	

}
