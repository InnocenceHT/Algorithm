package algorithm.test;

import algorithm.priority.MinPriorityQueue;

public class MinPriorityQueueTest {

    public static void main(String[] args) {
        //1.创建最小优先队列对象
        MinPriorityQueue<String> queue = new MinPriorityQueue<String>(10);

        //2.往队列中存数据
        queue.insert("H");
        queue.insert("G");
        queue.insert("F");
        queue.insert("E");
        queue.insert("D");
        queue.insert("C");
        queue.insert("B");
        queue.insert("A");

        //3.通过循环获取最小有限队列中的元素
        while (!queue.isEmpty()) {
            String min = queue.delMin();
            System.out.print(min + " ");
        }

    }
}
