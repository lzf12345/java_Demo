public class Student {

    static final String schoolName;
    String name;
    int age;

    static{
        schoolName = "江西科技师范大学";
        System.out.println("Student的动态代码块被执行");
    }

    {
        name = "Tom";
        age = 18;
    }
    public Student(){}

    public Student(String name,int age){
        this.name = name;
        this.age = age;
    }
    public void show(){
        System.out.println(String.format("学校：%s\t姓名：%s\t年龄：%d\t",schoolName,name,age));
    }

    public static String getSchoolName() {
        return schoolName;
    }

}
