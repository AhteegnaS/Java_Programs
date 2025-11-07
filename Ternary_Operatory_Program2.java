
public class Program2 {

	public static void main(String[] args) {
		int num1 = -2;
		var result1 = (num1 % 2 == 0) ? " The number is even" : "The number is odd";
		var result2 = (num1 > 0) ? " and positive" : " and negative";
		System.out.println(result1 + result2);
		var result = (num1 % 2 == 0) ? ((num1 > 0) ? "Even-Positive" : "Even-Negative") : ((num1 < 0) ? "Odd-Positive" : "Odd-Negative");
        System.out.println(result);
	}

}
