import java.util.Scanner;
public class ProgramPosNeg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc = new Scanner (System.in);
      int number = sc.nextInt();
      String res = (number != 0)?((number > 0) ? " is a positive number." : " is a negative number.") : " is a zero.";
	 System.out.println(number +" " + res);
	 sc.close();
	}

}
