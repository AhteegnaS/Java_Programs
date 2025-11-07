package classes;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Laptop lp = new Laptop();
		
		lp.serialId = 111234;
		lp.brand = "hp";
		lp.cost = 56000;
		System.out.println("The serial ID of the Laptop is " +lp.serialId);
		System.out.println("It is of " + lp.brand + " brand.");
		System.out.println("Which is of " + lp.cost + " rs.");
		
		
		lp.shutDown();
		System.out.println();
		
		Laptop lp1 = new Laptop();
		
		/*lp1.serialId = 298256;
		lp1.brand = "Lenovo";
		lp1.cost = 35000; */
		
		lp1.switchOn();
		
		// instaed we can use anonymous object 
		new Laptop().switchOn();
		

	}

}
