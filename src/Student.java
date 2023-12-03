import java.util.PriorityQueue;
import java.util.Queue;

// Student类相关功能测试在TestStudent.java中
public class Student {
    private final int sNO;
    private final String sName;
    private final String sSex;
    private final int sAge;
    private final int sJava;

    Student(int no,String nm,String sex,int age,int sJava){
//        if(sex != "男" || sex != "女"){
//            throw new IllegalArgumentException("Invalid Sex");
//        }
        this.sNO = no;
        this.sName = nm;
        this.sSex = sex;
        this.sAge = age;
        this.sJava = sJava;
    }
    public int getNo(){
        return this.sNO;
    }
    public String getName(){
        return this.sName;
    }
    public String getSex(){
        return this.sSex;
    }
    public int getAge(){
        return this.sAge;
    }
    public int getJava(){
        return this.sJava;
    }
    @Override
    public String toString(){
        return (
                "学号：" + this.sNO + "\n" +
                "姓名：" + this.sName + "\n" +
                "性别：" + this.sSex + "\n" +
                "年龄：" + this.sAge + "\n" +
                "Java课程成绩：" + this.sJava
        );
    }
    public static int javaAverage(Student s1, Student s2){
        int j1 = s1.getJava();
        int j2 = s2.getJava();
        return (j1+j2)/2 ;
    }
}
