package classes;
import java.util.Scanner;
public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		Student s = new Student();
		s.name = sc.nextLine();
		s.age = sc.nextInt();
		s.marks = sc.nextInt();
		sc.nextLine();
		s.status =sc.nextBoolean();
		sc.nextLine();
		
	
		
		System.out.println(s.name);
		System.out.println(s.age);
		System.out.println(s.marks);
		System.out.println(s.status);
		
		if (s.status == true ) {
		    s.practice();
		
		} else {
			s.study();
		}
		sc.nextLine();
		
		Student s1 = new Student();
		s1.name = sc.nextLine();
		s1.age = sc.nextInt();
		s1.marks = sc.nextInt();
		sc.nextLine();
		s1.status =sc.nextBoolean();
		
		System.out.println(s1.name);
		System.out.println(s1.age);
		System.out.println(s1.marks);
		System.out.println(s1.status);
		
		if (s1.status == false ) {
		    s1.practice();
		
		} else {
			s1.study();
		}
		sc.close();
	}
}

 class Student {
	String name;
	int age;
	int marks;
	boolean status;
	
	void study() {
		System.out.println("Studying.");
	}
	
	void practice() {
		System.out.println("Practicing");
	}
}

