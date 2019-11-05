public class StudentText {
    public static void main(String[] args) {
        System.out.println("调用Student.schoolName的结果："+Student.schoolName);
        System.out.println("调用Student.getSchoolName()的结果："+Student.getSchoolName());

        System.out.println("-----------------------------------------------");
        Student stu1 = new Student();
        System.out.println("调用stu1.getSchoolName()的结果："+stu1.getSchoolName());
        stu1.show();
        Student stu2 = new Student("Candy",19);
        System.out.println("调用stu2.getSchoolName()的结果："+stu2.getSchoolName());
        stu2.show();

    }
}
