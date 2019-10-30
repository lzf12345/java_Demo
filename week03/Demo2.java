public class Demo2{
	public static void main(String[] args){
		int score=70;
		String s = null;
		if(score>=90)
			s = "优";
		else if(score>=80)
			s = "良";
		else if(score>=70)
			s = "中";
		else if(score>=60)
			s = "及格";
		else
			s = "不及格";
		System.out.println("你的成绩为："+s);
	}
}