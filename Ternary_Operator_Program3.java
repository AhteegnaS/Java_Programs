/*Check whether the given number is greater than 50 and divisible by 5 in all 4 possible ways  */
public class Program3 {

	public static void main(String[] args) {
		int num1 = 75 ;
		var result = (num1 % 5 == 0) ? ((num1>50) ? "Divisible by 5 and greater than 50" : "Divisible by 5 but not greater than 50") : ((num1>50) ? "Not divisible by 5 but is greater than 50 " : "not divisible by 5 nor greater than 50");
       
		System.out.println(result); 
	}

}
