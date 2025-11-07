
public class ExplicitTypecasting {

	public static void main(String[] args) {
		double a = 983638.776325;
		System.out.println(a);
		float b = (float) a;
		System.out.println(b);
		int c = (int) b;
		System.out.println(c);
		long d = (long) a;
		System.out.println(d);
		
		float e = 129.08f;
		System.out.println(e);
		
		byte f = (byte) e; // the values which  are out of the range the values get cycled until it satisfies the number assigned
		System.out.println(f);
		short g =(short) e;
		System.out.println(g);
		
	}

}
