package datastructure;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * HashMap 是一个散列表，它存储的内容是键值对(key-value)映射。
 * HashMap 实现了 Map 接口，根据键的 HashCode 值存储数据，具有很快的访问速度，最多允许一条记录的键为 null，不支持线程同步。
 * HashMap 是无序的，即不会记录插入的顺序。
 * HashMap 继承于AbstractMap，实现了 Map、Cloneable、java.io.Serializable 接口。
 *
 * HashMap 中的元素实际上是对象，一些常见的基本类型可以使用它的包装类。
 * 基本类型对应的包装类表如下：
 * 基本类型	引用类型
 * boolean	Boolean
 * byte	Byte
 * short	Short
 * int	Integer
 * long	Long
 * float	Float
 * double	Double
 * char	Character
 */
public class JavaHashMap {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        // put(key, value) 添加元素
        map.put("key", "value");
        map.put("google", "google.com");
        System.out.println(map);

        // get(K key) 获取key对应的value
        System.out.println(map.get("google"));

        // remove(K key) 删除对应的key-value对
        map.remove("key");
        System.out.println(map);

        // clear() 删除所有的键值对
        map.clear();
        System.out.println(map);

        // 迭代 HashMap
        // 可以使用 for-each 来迭代 HashMap 中的元素。
        //
        // 如果你只想获取 key，可以使用 keySet() 方法，然后可以通过 get(key) 获取对应的 value，如果你只想获取 value，可以使用 values() 方法。
        map.put("google", "google.com");
        map.put("baidu", "baidu.com");
        map.put("huawei", "huawei.com");
        for (String key : map.keySet()) {
            System.out.println(key);
        }

        for (String value : map.values()) {
            System.out.println(value);
        }

        // size() 计算键值对的数量
        System.out.println(map.size());

        // putAll(Map<K, V> map) 将map中所有的键值对添加进来
        HashMap<String, String> putAll = new HashMap<>();
        putAll.putAll(map);
        System.out.println(putAll);

        // putIfAbsent(K key, V value) 如果 hashMap中不存在指定的key键，则将指定的键/值对插入到 hashMap 中。
        putAll.putIfAbsent("huawei", "huawei.com");
        System.out.println(putAll);
        putAll.putIfAbsent("huawei", "test.huawei.com");
        System.out.println(putAll);
        putAll.putIfAbsent("xiaomi", "xiaomi.com");
        System.out.println(putAll);
        System.out.println(map);
        putAll.clone(); // HashMap 有clone的方法，Map没有clone的方法 clone方法可以复制一份HashMap集合

        // remove(K key) 删除指定key的键值对元素
        putAll.remove("xiaomi");
        System.out.println("remove test:===============");
        System.out.println(putAll);
        System.out.println(map);

        // containsKey()(K key) 检查 hashMap 中是否存在指定的 key 对应的映射关系。
        // containsValue(V value) 	检查 hashMap 中是否存在指定的 value 对应的映射关系。
        System.out.println(putAll.containsKey("huawei"));
        System.out.println(putAll.containsKey("datang"));
        System.out.println(putAll.containsValue("huawei.com"));
        System.out.println(putAll.containsKey("datang.com"));

    }

}
