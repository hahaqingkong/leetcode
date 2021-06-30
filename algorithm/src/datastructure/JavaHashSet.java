package datastructure;

import java.util.HashSet;

/**
 * HashSet 基于 HashMap 来实现的，是一个不允许有重复元素的集合。
 * HashSet 允许有 null 值。
 * HashSet 是无序的，即不会记录插入的顺序。
 * HashSet 不是线程安全的， 如果多个线程尝试同时修改 HashSet，则最终结果是不确定的。 您必须在多线程访问时显式同步对 HashSet 的并发访问。
 * HashSet 实现了 Set 接口。
 * HashSet 中的元素实际上是对象，一些常见的基本类型可以使用它的包装类。
 */
public class JavaHashSet {

    public static void main(String[] args) {
        HashSet<String> stringHashSet = new HashSet<>();
        // add() 添加元素
        stringHashSet.add("a");
        stringHashSet.add("b");
        stringHashSet.add("c");
        stringHashSet.add("a"); // HashSet不会添加重复元素
        System.out.println(stringHashSet);

        // contains() 判断是否含有元素
        System.out.println(stringHashSet.contains("a"));
        System.out.println(stringHashSet.contains("d"));

        // remove() 删除元素
        stringHashSet.remove("a");
        System.out.println(stringHashSet);

        // clear() 删除所有元素，清空集合
        stringHashSet.clear();
        System.out.println(stringHashSet);

        // size() 计算元素的数量
        System.out.println(stringHashSet.size());
        stringHashSet.add("a");
        System.out.println(stringHashSet.size());

        // for-Each 可以循环
        stringHashSet.add("Google");
        stringHashSet.add("Runoob");
        stringHashSet.add("Taobao");
        stringHashSet.add("Zhihu");
        stringHashSet.add("Runoob");
        for (String str : stringHashSet) {
            System.out.println(str);
        }
    }
}
