package datastructure;

import java.util.Vector;

/**
 * Vector 类实现了一个动态数组。和 ArrayList 很相似，但是两者是不同的：
 *
 * Vector 是同步访问的。
 * Vector 包含了许多传统的方法，这些方法不属于集合框架。
 * Vector 主要用在事先不知道数组的大小，或者只是需要一个可以改变大小的数组的情况。
 */
public class JavaVector {
    // 构造方法
    Vector vector = new Vector(); // 默认构造方法 默认大小为10

    // Vector(int size)
    Vector vectorSize = new Vector(10); // 创建指定大小的向量。

    // Vector(int size, int incr)
    Vector vectorSizeIncr = new Vector(10, 5); // 创建指定大小的向量，并且增量用 incr 指定。增量表示向量每次增加的元素数目。

    // Vector(Collection c)
    Vector vectorCollection = new Vector(vectorSize); // 创建一个包含集合 c 元素的向量

    public static void main(String[] args) {
        
    }
}
