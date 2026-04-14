import java.util.Scanner;
class Student{
   String FullName;
   int rollNumber;
   String department;
   String email;
   Long mobileNumber;

    public void setInput(String FullName,int rollNumber, String department,String email,Long mobileNumber)
    {
	this.FullName=FullName;
	this.rollNumber=rollNumber;
	this.department=department;
	this.email=email;
	this.mobileNumber=mobileNumber;

    }
    public void DisplayDetails()
    {
    	System.out.println("FullName:"+FullName);
    	System.out.println("rollNumber:"+rollNumber);
    	System.out.println("department:"+department);
    	System.out.println("email:"+email);
    	System.out.println("mobileNumber:"+mobileNumber);
    }
}



class LibraryMembershipRegistration{

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		Student s1 = new Student();
		System.out.println("Enter the name of the student :");
		String name = sc.nextLine();
		System.out.println("Enter Roll Number :");
		int rollNo = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Department Name :");
		String department = sc.nextLine();
		System.out.println("Enter Email :");
		String email = sc.nextLine();
		System.out.println("Enter Mobile Number :");
		long mobileNumber = sc.nextLong();
		s1.setInput(name,rollNo,deprtment,email,monileNumber);
		s1.display();
	}
}

}