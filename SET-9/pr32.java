import java.util.*;

public class practical_32 {

    public static <T> boolean searchElement(LinkedList<T> list, T key) {
        return list.contains(key);
    }

    public static void main(String[] args) {

        LinkedList<Integer> nums = new LinkedList<>();
        nums.add(101);
        nums.add(102);

        System.out.println("Search 101: " + searchElement(nums, 101));

        LinkedList<String> names = new LinkedList<>();
        names.add("Rachit");
        names.add("Aman");

        System.out.println("Search Aman: " + searchElement(names, "Aman"));
    }
}
