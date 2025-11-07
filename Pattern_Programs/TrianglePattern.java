package simple;

public class TrianglePattern {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 9; j++) {
				if (i == 1 && j ==5 ) {
					System.out.print("*");
				}
				if (i == 2 && j >= 6 - i && j <= 5  ) {
					System.out.print("*");
				} 
				if (i == 3 && j > 2 && j % 2 != 0 && j < 9 ) {
					System.out.print("*");
				} else if (i == 4 && j % 2 == 0) {
					System.out.print("*");
				} else if (i == 5 && j % 2 != 0) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		
		for ( int i=1; i <= 5; i++) {
			for (int sp =1; sp <= (5 -i); sp ++) {
				System.out.print(" ");
			}
			for ( int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for ( int i=6; i <= 9; i++) {
			for (int sp =6; sp <= (9 -i); sp ++) {
				System.out.print(" ");
			}
			for ( int j = 6; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for ( int i=9; i >= 5; i--) {
			for (int sp = 6; sp <= i; sp ++) {
				System.out.print(" ");
			}
			for ( int j = 6; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for ( int i=5; i >= 9; i++) {
			for (int sp = 5; sp <= i; sp ++) {
				System.out.print(" ");
			}
			for ( int j = 9; j <= i; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}


	}

}
