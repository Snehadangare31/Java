import java.util.ArrayList;
import java.util.HashMap;

public class CollectionsExample {
    public static void main(String[] args) {
        // Using an ArrayList
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        
        System.out.println("Fruits: " + fruits);

        // Using a HashMap
        HashMap<String, Integer> ageMap = new HashMap<>();
        ageMap.put("Alice", 25);
        ageMap.put("Bob", 30);
        ageMap.put("Charlie", 35);

        System.out.println("Ages:");
        for (String name : ageMap.keySet()) {
            System.out.println(name + " is " + ageMap.get(name) + " years old.");
        }
    }
}
