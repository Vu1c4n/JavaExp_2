import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        testStudent();
        testCircle();
        testTriangle();
    }
    public static void testStudent(){
        average();
        min();
    }
    public static void testCircle(){
        System.out.println("详情见Circle.java");
    }
    public static void testTriangle(){
        Triangle t = new Triangle();
        t.setTri(0,0,0,3,4,0);
        System.out.println("面积为："+t.getArea());
        System.out.println("周长为：" + t.getPerimeter());
    }
    public static void average(){
        Student s1 = new Student(1,"陈锦焱1","man",12,100);
        Student s2 = new Student(1,"陈锦焱2","man",12,95);
        double avr = ((double) s1.getJava() + (double) s2.getJava())/2;
        System.out.println("2人平均值为："+'\t'+avr);
    }
    public static void min(){
        Student s1 = new Student(1,"陈锦焱","man",12,100);
        Student s2 = new Student(1,"sss","man",12,1);
        Student s3 = new Student(1,"dsa","man",12,13);
        Student s4 = new Student(1,"asd","man",12,15);
        Student s5 = new Student(1,"asd","man",12,102);
        System.out.println(s1);
        Student[] s_list = new Student[]{s1,s2,s3,s4,s5};
        Queue<Integer> q = new PriorityQueue<>();
        for(Student s : s_list){
            q.offer(s.getJava());
        }
        Integer min = q.poll();
        /*
         ***原来写的是int min = q.poll()，会提示"unboxing of xx will cause Nullptr..."
         */
        for(int i = 0; i < 3;i++){
            q.poll();
        }
        Integer max = q.poll();
        System.out.println("5人中最小值：" + '\t' + min);
        System.out.println("5人中最大值：" + '\t' + max);
    }
}
