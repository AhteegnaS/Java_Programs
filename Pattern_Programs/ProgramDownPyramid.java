package simple;
import java.util.Scanner;

public class ProgramDownPyramid {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
        int col = sc.nextInt();
        for (int i = 1; i <= col; i++) {
        	for (int j = col; j >= i; j--) {
        		System.out.print("* ");
        	}
        	System.out.println();
        }
        sc.close();
	}

}
