import java.util.ArrayList;
import java.util.List;

public class classroom {
    public static void main(String[] args) {

        // Integer ArrayList
        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list);   // [1, 2, 3, 4, 5]

        // Get operation → O(1)
        int element = list.get(2);
        System.out.println(element); // 3

        // Remove operation → O(n)
        list.remove(2);
        System.out.println(list);    // [1, 2, 4, 5]

        // Set operation → O(1)
        list.set(2, 10);
        System.out.println(list);    // [1, 2, 10, 5]

        // Contains operation → O(n)
        System.out.println(list.contains(10)); // true
        System.out.println(list.contains(3));  // false
    }
}







