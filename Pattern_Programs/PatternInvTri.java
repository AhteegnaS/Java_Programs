package simple;
import java.util.Scanner;

public class PatternInvTri {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		 int N = sc.nextInt();
   for (int i = 1; i <= N; i++) {
	 for (int j = 1; j <= i; j++) {
		 System.out.print(j + " ");
	 }
	 System.out.println();
   }
 
 
 //int M = sc.nextInt();
 
   for (int i = N; i >= 1; i--) {
	 for (int j = 1; j <= i; j++) {
		 System.out.print(j + " ");
	 }
	 System.out.println();
   }
 
 /*------------------------------------------------- */
   for (int i = N; i >= 1; i--) {
	   int num = 1;
		 for (int j = 1; j <= i; j++) {
			 System.out.print(num + " ");
			 num++;
		 }
		 System.out.println();
	   }
   sc.close();
	}

}
