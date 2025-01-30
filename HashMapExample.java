import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        // Create a HashMap with String keys and Integer values
        HashMap<String, Integer> map = new HashMap<>();

        // Add key-value pairs
        map.put("Alice", 25);
        map.put("Bob", 30);
        map.put("Charlie", 28);

        // Retrieve a value using a key
        System.out.println("Alice's age: " + map.get("Alice"));

        // Check if a key exists
        if (map.containsKey("Bob")) {
            System.out.println("Bob is in the map.");
        }

        // Check if a value exists
        if (map.containsValue(28)) {
            System.out.println("Someone is 28 years old.");
        }

        // Iterate through the HashMap
        System.out.println("HashMap Contents:");
        for (String key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }

        // Remove an entry
        map.remove("Charlie");

        // Check the size of the HashMap
        System.out.println("Size of HashMap: " + map.size());

        // Clear all elements
        map.clear();
        System.out.println("Is HashMap empty? " + map.isEmpty());
    }
}
