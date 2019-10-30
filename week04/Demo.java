import java.util.Scanner;
public class Demo{
	public static void main(String[] args){
		
		System.out.print("请输入金字塔的层数：");
		Scanner in =new Scanner(System.in);
		int n = in.nextInt();
		
		for(int i = n;i > 0;i--)
		{
			for(int j = i-1;j > 0;j--)
				System.out.print(" ");
			
			for(int j = n-i+1;j > 0;j--)
				System.out.print("* ");
			System.out.println();
		}
	}
}
		
		