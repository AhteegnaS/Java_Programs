package Program1;

class Student {

	int rollNo ;
	String name ;
	int marks;
	void study() {
		System.out.println(name + " is Studying.");
	}
	void practice() {
		System.out.println(name + " is Practicing.");
	}
}

   
 class Main {
	 public static void main(String [] args) {
		 Student s1 = new Student();
		 s1.rollNo =12; //s1 here is a reference variable
		 s1.name = "Sangeetha";
		 s1.marks = 95;
		 System.out.println("Roll number of the student is " +s1.rollNo + " .");
		 System.out.println("Name of the student is " +s1.name + " .");
		 System.out.println("Marks scored by the student is " + s1.marks + " .");
		 s1.study();
		 
		 
		 Student s2 = new Student();
		 s2.rollNo =13;
		 s2.name = "Jayashree";
		 s2.marks = 97;
		 System.out.println("\nRoll number of the student is " +s2.rollNo + " .");
		 System.out.println("Name of the student is " +s2.name + " .");
		 System.out.println("Marks scored by the student is " + s2.marks + " .");
		 s2.practice();
		 
		 new Student().study(); //this is the way of calling anonymous object , where you have to call the method only once 
		 new Student().practice();
		 
		 
	 }
 }