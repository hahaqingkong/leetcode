package datastructure;

import java.util.Stack;

/**
 * 栈 Stack  继承Vector(向量)
 * 栈是Vector的一个子类，它实现了一个标准的后进先出的栈。
 *
 * 堆栈只定义了默认构造函数，用来创建一个空栈。 堆栈除了包括由Vector定义的所有方法，也定义了自己的一些方法。
 * 继承关系
 * java.lang.Object
 * ↳     java.util.AbstractCollection<E>
 *    ↳     java.util.AbstractList<E>
 *        ↳     java.util.Vector<E>
 *            ↳     java.util.Stack<E>
 * public class Stack<E> extends Vector<E> {}
 *
 */
public class JavaStack {
    static Stack stack = new Stack(); // 默认构造函数

    static Stack<Integer> integerStack = new Stack<>(); // 可以带泛型

    static Stack<Object> objectStack = new Stack<>(); // 泛型

    public static void main(String[] args) {
        // 常用API接口
        // empty()  返回boolean
        System.out.println("1.stack.empty() return Boolean:判断stack是否为空");
        stack.empty(); // 返回boolean，返回stack是否为空
        System.out.println(stack.empty());

        System.out.println("2.stack.push(E)  return E:将元素E对象插入到栈中，并且返回E");
        // push()  返回泛型对象
        System.out.println(stack.push("o"));
        System.out.println(integerStack.push(1));
        System.out.println(objectStack.push("object"));

        System.out.println("3.stack.peek() return E:返回栈顶的元素，但是不删除");
        // peek() 返回stack顶的元素对象，但是不降元素从栈中删除
        System.out.println(stack.peek());
        System.out.println(integerStack.peek());
        System.out.println(objectStack.peek());

        System.out.println("4.stack.pop() return E：返回栈顶的元素，并且删除");
        // pop() 返回stack的栈顶元素，并且从栈中删除
        System.out.println(stack.empty());
        System.out.println(stack);
        Object o = stack.pop();
        Integer i = integerStack.pop();
        System.out.println(stack.pop());
        System.out.println(stack.empty());
        System.out.println(stack);

        System.out.println("5.stack.search(E e) return int:用于搜索堆栈中的元素并获取其与顶部的距离。此方法从1开始而不是从0开始计数位置。位于堆栈顶部的元素被视为在位置1。如果存在多个元素，则最接近顶部的元素的索引返回。如果成功找到该元素，则该方法返回其位置；如果缺少该元素，则返回-1。");
        integerStack.clear(); // Vector方法，清空栈
        integerStack.push(1);
        System.out.println(integerStack.search(1));
        System.out.println(integerStack.search(2));
        System.out.println(integerStack.pop());
        System.out.println(integerStack.search(1));
        integerStack.push(1);
        integerStack.push(1);
        integerStack.push(2);
        System.out.println(integerStack);
        System.out.println(integerStack.search(1));
        integerStack.push(3);
        System.out.println(integerStack);
        System.out.println(integerStack.search(3));

        integerStack.push(4);
        System.out.println(integerStack);
        System.out.println(integerStack.search(3));
    }

}
