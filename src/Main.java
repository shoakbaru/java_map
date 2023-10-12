import java.util.*;

public class Main {
    public static void main(String[] args) {
//        Map<Integer, String> map = new LinkedHashMap<>();
//        Map<Integer, String> map = new IdentityHashMap<>();
//        Map<Integer, String> map = new WeakHashMap<>();
//        map1.put(105,"D");
//        Map<Integer, String> map = new HashMap<>(); // initial 16 obj boladi. 16 * 0.75 default
//        Map<Integer, String> map = new HashMap<>(20); // 20 * 0.75
//        Map<Integer, String> map = new HashMap<>(20, 0.80f); // 20 * 0.80
//        Map<Integer, String> map = new HashMap<>(map1);


//        SortedMap<Integer, String> map = new TreeMap<>();
        NavigableMap<Integer, String> map = new TreeMap<>();

        map.put(101, "A");
        map.put(102, "B");
        map.put(103, "C");

//        System.out.println(map.higherKey(101));
//        System.out.println(map.lowerKey(102));
//        System.out.println(map.floorKey(103));
//        System.out.println(map.lastEntry());


//        System.out.println(map.firstKey());
//        System.out.println(map.headMap(102));
//        System.out.println(map.tailMap(102));
//        System.out.println(map.get(101));
//        System.out.println(map.remove(103));
//        System.out.println(map.containsKey(101));
//        System.out.println(map.containsValue("A"));
//        System.out.println(map.isEmpty());
//        System.out.println(map.size());
//        map.clear();
//        System.out.println(map.values());
//        System.out.println(map.entrySet());

        System.out.println(map);
    }
}