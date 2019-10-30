public class Demo3{
	public static void main(String[] args){
		int score=70;
		String s = null;
		switch(score/10){
			case 10: case 9:s = "优";break;
			case 8:s = "良";break;
			case 7:s = "中";break;
			case 6:s = "及格";break;
			default:s = "不及格";break;
		}
		System.out.println("你的成绩为："+s);
	}
}