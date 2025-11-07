package simple;
import java.util.Scanner;
public class PracticePro1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		 int N = sc.nextInt();
		 
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= i; j++) {      
				System.out.print( "0" + j + " "); //print number with 0
			}
			System.out.println();
		}
		
/*-------------------------------------------------------*/		

		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= i; j++) {
				if (i >= 10) {
					System.out.print(i + " ");
				} else {
					System.out.print( "0" + i + " ");
				}
				 //print i numbers with 0
			}
			System.out.println();
		}
/*-------------------------------------------------------*/			
		
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= i; j++) {
				if (i >= 5) {
				System.out.print(2*i + " "); 
				} else {
			  System.out.print( "0" + 2*i + " "); // 2i < 9 print just 2i
			   }
		}
			System.out.println();	
	}

/*-------------------------------------------------------*/	
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= i; j++) {
			 if (i % 2 == 0 && i < 6) {
			  System.out.print( "0" + 2*i + " ");
			   } else if (i > 6 && i % 2 == 0) {
					System.out.print(2*i + " ");
			   } else { 
				   System.out.print( "0" + i + " ");  
			   }
		}
			System.out.println();	
	}
		
/*-------------------------------------------------------*/		
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= i; j++) {
				if (i * 2 <= 9) {
			  System.out.print( "0" + 2*i + " ");
			   } else {
			     System.out.print(2 * i + " ");
			   }
				}
			System.out.println();	
	}

	
	sc.close();	
		
	}
}
