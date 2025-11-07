package simple;
import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();
		char ch = sc.next().charAt(0);
		for(int i = 1; i <= row; i ++) {
			for(int j = 1; j <= col; j++) {
				System.out.print(ch);
			}
			System.out.println();
		}
sc.close();
	}

}
