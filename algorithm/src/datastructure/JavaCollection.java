package datastructure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * Collection 集合接口
 * 三种实现List，Set，Queue
 */
public class JavaCollection {
    static  Collection collection = new ArrayList(); // ArrayList--->AbstractList--->List--->Collection

    public static void main(String[] args) {
        // Collection接口的方法
        // boolean add(E e)	向集合添加元素e，若指定集合元素改变了则返回true
        collection.add("a");
        // boolean addAll(Collection<? extends E> c)	把集合C中的元素全部添加到集合中，若指定集合元素改变返回true
        System.out.println(collection.add(new ArrayList<>()));
        // void clear()	清空所有集合元素
        collection.clear();
        // boolean contains(Object o)	判断指定集合是否包含对象o
        System.out.println(collection.contains("c"));
        // boolean containsAll(Collection<?> c)	判断指定集合是否包含集合c的所有元素
        List intList = new ArrayList<Integer>(Arrays.asList(1,2,3,1,2,3));
        List stringList = new ArrayList<String>(Arrays.asList("Buenos Aires", "Córdoba", "La Plata"));
        System.out.println(collection.containsAll(intList));
        collection.addAll(intList);
        System.out.println(collection.containsAll(intList));

        // boolean isEmpty()	判断指定集合的元素size是否为0
        System.out.println(collection.size());

        // boolean remove(Object o)	删除集合中的元素对象o,若集合有多个o元素，则只会删除第一个元素
        System.out.println(collection);
        System.out.println(collection.remove(1));
        System.out.println(collection);

        // boolean removeAll(Collection<?> c）	删除指定集合包含集合c的元素
        List removeIntList = new ArrayList(Arrays.asList(2));
        System.out.println(collection);
        System.out.println(collection.removeAll(removeIntList));
        System.out.println(collection);

        // boolean retainAll(Collection<?> c)	从指定集合中保留包含集合c的元素,其他元素则删除
        List retainIntList = new ArrayList(Arrays.asList(1));
        System.out.println(collection);
        System.out.println(collection.retainAll(retainIntList));
        System.out.println(collection);

        // int size()	集合的元素个数
        System.out.println(collection.size());

        // T[] toArray(T[] a)	将集合转换为T类型的数组
        System.out.println(collection.toArray());
    }
}
