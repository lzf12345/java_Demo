public class ForDemo {
	public static void main(String[] args) {
		int s,i;
		for(i=1,s=0;i<=100;i++) 
		{
			s += i;
			if (s>=1000)
				break;
		}
		
		System.out.println("i="+i+",s="+s);
	}
}