import java.util.PriorityQueue;
import java.util.Queue;

public class Test {
    public static void main(String[] args) {
        average();
        min();
    }

    public static void average(){
        Student s1 = new Student(1,"陈jy","man",12,100);
        Student s2 = new Student(1,"陈jy","man",12,95);
        double avr = ((double) s1.getJava() + (double) s2.getJava())/2;
        System.out.println("2人平均值为："+'\t'+avr);
    }
    public static void min(){
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
        System.out.println("5人中最小值：" + '\t' + min);
    }
}
