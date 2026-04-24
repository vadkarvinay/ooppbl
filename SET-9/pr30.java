import java.util.*;

public class practical_30 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter sentence: ");
        String input = sc.nextLine();

        String[] words = input.split(" ");
        HashMap<String, Integer> map = new HashMap<>();

        for (String w : words) {
            map.put(w, map.getOrDefault(w, 0) + 1);
        }

        for (String key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }

        sc.close();
    }
}
