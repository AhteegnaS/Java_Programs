package classes;
import java.util.Scanner;
public class Bussinessman {
 int p ;
 int t;
 static float r;
 static {
	 r = 2.00f;
 }
 float si;
 public void takeInputs( ) {
	 Scanner sc = new Scanner (System.in);
	 System.out.println("Enter the value of Principle (P) :");
	 p = sc.nextInt();
	 System.out.println("Enter the value of time (T) :");
	 t = sc.nextInt();
	
	 }
 public void simpleInterest () {
	 si = (p*t*r) / 100;
	 System.out.println("The simple interest is :" + si); 
 }
 
}

 class SIApp {
	public static void main(String[] args) {
		Bussinessman b1 = new Bussinessman();
		b1.takeInputs();
		b1.simpleInterest();
		System.out.println("=======================================================");
		Bussinessman b2 = new Bussinessman();
		b2.takeInputs();
		b2.simpleInterest();
		System.out.println("=======================================================");
		Bussinessman b3 = new Bussinessman();
		b3.takeInputs();
		b3.simpleInterest();
		
	}
}
