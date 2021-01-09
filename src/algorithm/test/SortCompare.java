package algorithm.test;

import algorithm.sort.Insertion;
import algorithm.sort.Shell;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class SortCompare {

    public static void main(String[] args) throws IOException {
        //1.创建一个ArrayList集合，保存读取出来的整数
        ArrayList<Integer> list = new ArrayList<>();

        //2.创建缓存读取流BufferedReader,读取数据，并存储到ArrayList中
        BufferedReader reader = new BufferedReader(new InputStreamReader(SortCompare.class.getClassLoader().getResourceAsStream("reverse_arr.txt")));
        String line = null;
        while ((line = reader.readLine()) != null) {
            //line是字符串，把line转换成Integer，存储到集合中
            int i = Integer.parseInt(line);
            list.add(i);
        }

        reader.close();

        //3.把ArrayList集合转化为数组
        Integer[] a = new Integer[list.size()];
        list.toArray(a);

        //4.调用测试代码完成测试
//        testInsertion(a);
        testShell(a);
    }

    //测试希尔排序
    public static void testShell(Integer[] a) {
        //1.获取执行程序之前的时间
        long start = System.currentTimeMillis();
        //2.执行算法的代码
        Shell.sort(a);
        //3.获取执行之后的时间
        long end = System.currentTimeMillis();
        //4.算出执行的时间并输出
        System.out.println("希尔排序执行的时间" + (end - start) + "毫秒");
    }

    //测试插入排序
    public static void testInsertion(Integer[] a) {
        //1.获取执行程序之前的时间
        long start = System.currentTimeMillis();
        //2.执行算法的代码
        Insertion.sort(a);
        //3.获取执行之后的时间
        long end = System.currentTimeMillis();
        //4.算出执行的时间并输出
        System.out.println("插入排序执行的时间" + (end - start) + "毫秒");
    }


}
