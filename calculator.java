package Program1;

 public class calculator {
	 
	static int num1 = 10;
	static int num2 =5;
	static void addRes(){ //no parameter no return value
		
		 int result1 = num1 + num2;
		 System.out.println("the sum of 10 and 5 is : " + result1);
	}
	
	static void subtract(int a , int b) { // with parameter but no return value
		int result2 = a - b;
		System.out.println("the difference between 10 and 5 is  : " +result2);
	}
	
	static int multiply() { //no parameter with return value
		
		int result3 = num1 * num2;
		return result3;
	}
	
	 static int divide(int a2 , int b2) { //with parameter and return value
		int result4 = a2 / b2 ;
		return result4;
		
	}
	 
	 public static void main(String[] args) {
		  
			//calculator c = new calculator();
		    addRes();
			subtract(10 , 5);
			int res1 = multiply();
			System.out.println("the product of 10 and 5 is : " + res1 );
			int res2 = divide(10,5);
			System.out.println("the quotient of 10 divided by 5 is : " + res2);
			

		}
}

/*if we have to call methods of a class, in the same class, in the program we just have to declare all the methods as static then we can just call the method by calling the name of method*/
 class Mainprogram1{
 public static void main(String[] args) {
	  
		//calculator c = new calculator();
		calculator.addRes();
		calculator.subtract(10 , 5);
		int res1 = calculator.multiply();
		System.out.println("the product of 10 and 5 is : " + res1 );
		int res2 = calculator.divide(10,5);
		System.out.println("the quotient of 10 divided by 5 is : " + res2);
		
		/* if we have to call methods of class in other class without creating a object then we have to declare the methods as static and methods can be called using classname.method(); */
	}
}
 
 class Mainprogram2{
		public static void main(String[] args) {
			  
			calculator c = new calculator();
			c.addRes();
			c.subtract(10 , 5);
			int res1 = c.multiply();
			System.out.println("the product of 10 and 5 is : " + res1 );
			int res2 = c.divide(10,5);
			System.out.println("the quotient of 10 divided by 5 is : " + res2);
			
			/* if we have to call methods of class in other class  creating a object then method can be called using reference_variable.method(); */
		}

	}
