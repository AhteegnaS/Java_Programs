package simple;

public class PatternProgram3 {

	public static void main(String[] args) {
		for (int i = 1 ; i <= 5; i++) {
			
			for (int j = 5; j <= 1; j--) {
				System.out.print(" ");
			}
			for (int k = 1 ; k <= i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}	
		
		
		
		for (int i =1; i <= 5; i++) {
			for (int j = 5; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= 4; k++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		
		System.out.println();
		
		for (int i =1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= 5; k++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		
		for (int i =2; i <= 5; i++) {
			for (int j = 5; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= 5; k++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		
		System.out.println();
		
		
		for (int i =1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("-");
			}
			for (int k = 1; k <= 5; k++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		
		for (int i =2; i <= 5; i++) {
			for (int j = 5; j >= i; j--) {
				System.out.print("-");
			}
			for (int k = 1; k <= 5; k++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		
		System.out.println();
		
		for (int i =5; i <= 2; i--) {
			for (int j = i; j <= 9; j++) {
				System.out.print("-");
			}
			for (int k = 5; k >= i; k--) {
				System.out.print("* ");
			}
			System.out.println();
			
		}
	}

}
