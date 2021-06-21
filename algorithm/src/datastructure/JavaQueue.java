package datastructure;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Java  Queue  队列 继承Collection
 * 特点：先进先出 FIFO First In First Out
 * 单向队列 Queue
 * 双向队列 Deque
 * 优先级队列
 *
 */
public class JavaQueue {

    // 队列是一种特殊的线性表，它只允许在表的前端进行删除操作，而在表的后端进行插入操作。
    // LinkedList类实现了Queue接口，因此我们可以把LinkedList当成Queue来用。
    static Queue queue = new LinkedList();

    // 双端队列 两端都可以进出
    static Deque deque = new LinkedList();

    public static void main(String[] args) {

        System.out.println("Queue API:");
        // 队列增加一个元素 offer()
        // add()方法也可以增加一个元素，但是失败时会抛出异常，offer()失败时返回false;
        System.out.println("Queue API:offer() 队列增加一个元素");
        System.out.println(queue.offer("a"));
        System.out.println(queue);

        // 返回队列的第一个元素，并且删除该元素 poll()
        // remove()方法也可以返回队列第一个元素并且删除，但是该方法失败时会抛出异常，poll()失败时返回null
        System.out.println("Queue API:poll() 返回队列的第一个元素，并且删除该元素");
        System.out.println(queue.poll());
        System.out.println(queue);

        // 返回队列的第一个元素，但是不删除 peek()
        // element()方法也可以返回队列的第一个元素，但是队列为空时，抛出异常，peek()返回null
        System.out.println("Queue API:peek() 返回队列的第一个元素，但是不删除");
        queue.offer("b");
        System.out.println(queue.peek());
        System.out.println(queue);

        // isEmpty() 返回队列是否为空队列
        System.out.println(queue.isEmpty());
        queue.poll();
        System.out.println(queue.isEmpty());

        System.out.println("Deque API:");
        System.out.println("Deque API:offerFirst() 在队列头部插入一个元素，返回true/false");
        deque.offerFirst("a");
        System.out.println(deque);
        deque.offer("cccccc");

        System.out.println("Deque API:offerLast() 在队列尾部插入一个元素，返回true/false");
        deque.offerLast("zzz");
        System.out.println(deque);

        // 在头部再加入一个看看那
        deque.offerFirst("aaa");
        System.out.println(deque);

        System.out.println("Deque API:peekFirst() 获取头部元素，不删除");
        System.out.println(deque.peekFirst());

        System.out.println("Deque API:peekLast() 获取尾部元素，不删除");
        System.out.println(deque.peekLast());

        System.out.println("Deque API:pollFirst() 获取头部元素，并且删除");
        System.out.println(deque.pollFirst());
        System.out.println(deque);

        System.out.println("Deque API:pollLast() 获取尾部元素，并且删除");
        System.out.println(deque.pollLast());
        System.out.println(deque);
    }
}
