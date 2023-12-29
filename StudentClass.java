package com.controlstatements;

public class StudentClass {
	static String  CollegeName;
	
	String FirstName;
	String LastName;
	int Id;
	int age;
	static {
		CollegeName="ABC University";
	}
	public StudentClass(String FirstName,String LastName,int Id,int age) {
		this.FirstName=FirstName;
		this.LastName=LastName;
		this.Id=Id;
		this.age=age;
		displayStudentInfo();
		
	}
		public void displayStudentInfo() {
			System.out.println("CollegeName:"+CollegeName);
			System.out.println("FirstName:"+FirstName);
			System.out.println("LastName:"+LastName);
			System.out.println("Id:"+Id);
			System.out.println("age:"+age);
			
		}
		
		public static void main(String[] args) {
			
			 StudentClass student1 = new StudentClass("Priya","Sharma",1,21);
			 System.out.println();
		 StudentClass student2=new StudentClass("Anu","kammili",2,22);
		 System.out.println();
		 StudentClass student3=new StudentClass("jack","alex",3,21);
			
				
			
		}
}

