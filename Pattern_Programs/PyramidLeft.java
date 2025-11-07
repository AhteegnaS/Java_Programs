package simple;
import java.util.Scanner;

public class PyramidLeft {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
        int col = sc.nextInt();
        for (int i = col; i >= 1; i--) {
        	for (int j = 1; j <= col; j++) {
        		System.out.print("*");
        	}
        	System.out.println();
        }
        sc.close();
	}

}
