package algorithm.test;

import algorithm.sort.Student;

/*
    定义测试类Test，在测试类Test中定义测试方法Comparable getMax(Comparable c1,Comparable c2)完成测试
 */
public class TestComparable {

    public static void main(String[] args) {
        //创建两个Student对象，并调用getMax方法，完成测试
        Student s1 = new Student("张三",18);
        Student s2 = new Student("李四",20);

        Comparable max = getMax(s1, s2);
        System.out.println(max);
    }

    public static Comparable getMax(Comparable c1,Comparable c2) {
        int result = c1.compareTo(c2);
        //如果result<0，则c1比c2小；如果result>0，则c1比c2大；如果result==0，则c1,c2一样大；

        if (result>=0) {
            return c1;
        }else {
            return c2;
        }
    }
}
