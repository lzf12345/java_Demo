public class Demo{
	public static void main(String[] args) {
		int x,y,z;
		x = 200;
		y = 023;
		z = 0x3f;
		
		Integer m = 128;
		Integer n = 128;
		
		System.out.println("x == m:"+(m == x)); 
		System.out.println("m == n:"+(m == n)); 
		System.out.println("m == n:"+m.equals(n));
 
		byte b;
		b = 100;
		
		System.out.println("x = "+x);
		System.out.println("y = "+y);
		System.out.println("z = "+z);
		System.out.println("b = "+b);
		
		
		float f = 23.5f;
		double d = f;
		
		System.out.println("f == d :"+(f==d));
		
		
		char c1 = 'A';
		char c2 = 'С';
		char c3 = '\t';
		
		System.out.println("c1="+c1);
		System.out.println("c2="+c2);
		System.out.print("c3="+c3);
		System.out.println("mmmmmmm");
		
		boolean bl = false;
		
		System.out.println("bl = "+bl);
	}
}