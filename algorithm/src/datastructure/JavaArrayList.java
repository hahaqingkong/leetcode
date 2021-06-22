package datastructure;

import java.util.ArrayList;
import java.util.List;

/**
 * ArrayList 集合
 * ---->继承
 * ====>实现
 * 继承关系：ArrayList--->AbstractList(虚类)===>List(接口)              --->Collection(接口)
 *                                      |--->AbstractCollection(虚类)====↑
 * 优点：
 * 1、支持自动改变大小
 * 2、可以灵活的插入元素
 * 3、可以灵活的删除元素
 */
public class JavaArrayList {
    static List<String> stringList = new ArrayList<>(); // 不初始化刚开始的数组容量，当数组容量满时数组会自动一当前数组容量的2倍扩容
    static List<Integer> integerList = new ArrayList<>(10); // 初始化容量为10
    static List<Integer> integerList1 = new ArrayList<>(integerList); // 用一个集合初始化

    public static void main(String[] args) {
        // add（object value） ;将指定元素object value追加到集合的末尾
        stringList.add("a");
        System.out.println(stringList);

        // add（int index,  Object obj）;
        // 1.在集合指定位置index位置，添加新元素obj
        // 2.功能说明：假设集合list中有元素[“java”,“javaEE”]，当使用add(1，“javaWeb”)后，集合list中的元素为[“java”,“javaWeb”,“JavaEE”]。
        // 3.可以用Insert(int index,object value)将元素插入到索引处，不过其有一定的限制性,必须在数组长度以内插入数组；
        // 4.InsertRange(int index,ICollection c)方法一样；
        stringList.add(1, "b");
        stringList.add(2, "c");
        stringList.add(1, "bb");
        System.out.println(stringList);

        // remove();
        // 1.boolean remove(Object o); 删除元素o
        // 2.E remove(int index); 删除下标为index的元素，index超过list长度，抛出异常
        // 说明：如果ArrayList泛型是Integer，remove(int index) 也是按照下标删除
        stringList.remove("a");
        System.out.println(stringList);
        stringList.remove(1);
        System.out.println(stringList);

        integerList.add(100);
        integerList.add(200);
        integerList.add(300);
        integerList.add(400);
        integerList.add(500);
        System.out.println(integerList);
        integerList.remove(0);
        System.out.println(integerList);
        // integerList.remove(100);

        // size(); 获取数组长度
        System.out.println(stringList.size());
        System.out.println(integerList.size());

        // E set(int index, E element); 设置index位置的元素为element
        System.out.println(integerList);
        System.out.println(integerList.set(3, 3000));
        System.out.println(integerList.set(1, 1000));
        System.out.println(integerList);

        // void clear(); 清空集合元素
        System.out.println(stringList);
        stringList.clear();
        System.out.println(stringList);

        // E get(int index); 获取index位置的元素
        System.out.println(integerList.get(0));
        System.out.println(integerList.get(1));
        System.out.println(integerList.get(2));
        System.out.println(integerList.get(3));
    }
}
