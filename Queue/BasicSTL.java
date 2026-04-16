package problems_in_queue;


import java.util.LinkedList;
import java.util.Queue;

public class BasicSTL {
    public static void main(String[] args) {
        Queue<Integer> queue=new LinkedList<>();
        System.out.println(queue.isEmpty());
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        System.out.println(queue);
        System.out.println(queue.size());
        queue.remove();
        System.out.println(queue);
        System.out.println(queue.size());
    }
}
