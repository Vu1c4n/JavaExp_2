import java.util.PriorityQueue;
import java.util.Queue;

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
    public void printStudent(){
        System.out.println(
                "学号：" + this.sNO + "\n" +
                "姓名：" + this.sName + "\n" +
                "性别" + this.sSex + "\n" +
                "年龄" + this.sAge + "\n" +
                "Java课程成绩" + this.sJava
        );
    }
    public static int javaAverage(Student s1, Student s2){
        int j1 = s1.getJava();
        int j2 = s2.getJava();
        return (j1+j2)/2 ;
    }
    public static void main(String[] args) {
        Student s1 = new Student(1,"陈jy","man",12,100);
        Student s2 = new Student(1,"sss","man",12,1);
        Student s3 = new Student(1,"dsa","man",12,13);
        Student s4 = new Student(1,"asd","man",12,15);
        Student s5 = new Student(1,"asd","man",12,102);
        s1.printStudent();
        Student[] s_list = new Student[]{s1,s2,s3,s4,s5};
        Queue<Integer> q = new PriorityQueue<>();
        for(Student s : s_list){
            q.offer(s.getJava());
        }
        int min = (int) q.poll();
        for(int i = 0; i < 3;i++){
           q.poll();
        }
        int max = q.poll();
        System.out.println("最小值：" + '\t' + min);
    }
}
