package day2;

import java.util.Scanner;

public class Bubblesort {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
int[] a1 = new int[a];

 for(int i = 0; i < a; i++) 
 {
	a1[i] = sc.nextInt();
}
int b = sc.nextInt();
int[] b1 = new int[b];

for(int i = 0; i < b; i++) 
{
	b1[i] = sc.nextInt();
}

int[] c = new int[a + b];
for(int i = 0; i < a; i++) {
	c[i] = a1[i];
}
for(int i = 0; i < b; i++) {
	c[a + i] = b1[i];
}
for(int i = 0; i < c.length-1; i++) {
	for(int j = 0; j < c.length-i-1; j++) {
		if(c[j]>c[j+1]) {
			int temp = c[j];
			c[j] = c[j+1];
			c[j+1]= temp;
		}
	}
}

for(int i = 0; i < c.length;i++) {
	System.out.print(c[i]);
}
sc.close();
}
}


