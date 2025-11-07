package classes;

public class Program2 {
	static int a , b;
	static {
		System.out.println("Inside the static block");
		a = 13;
		b = 23;
	}
     static void display1() {
    	 System.out.println("Inside the static method :");
    	 System.out.println(a);
    	 System.out.println(b);
     }
     
     int c , d;
     {
    	 System.out.println("Inside the instance block :");
    	  a = 234;
    	  b = 876;
    	  c = 456;
    	  d = 908;
     }
     void display2() {
    	 System.out.println("Inside the imstance method :");
    	 System.out.println(a);
    	 System.out.println(b);
    	 System.out.println(c);
    	 System.out.println(d);
     }
}
