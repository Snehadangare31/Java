import java.util.*;

public class CollectionGenericsExample {
    public static void main(String[] args) {
        // Demonstrate ArrayList with Generics
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");

        System.out.println("ArrayList Elements:");
        for (String fruit : arrayList) {
            System.out.println(fruit);
        }

        // Demonstrate HashSet with Generics
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(10);
        hashSet.add(20);
        hashSet.add(30);
        hashSet.add(20); // Duplicate element, will not be added

        System.out.println("\nHashSet Elements:");
        for (Integer number : hashSet) {
            System.out.println(number);
        }

        // Demonstrate HashMap with Generics
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "One");
        hashMap.put(2, "Two");
        hashMap.put(3, "Three");

        System.out.println("\nHashMap Elements:");
        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Demonstrate a custom generic method
        System.out.println("\nGeneric Method Demonstration:");
        printElements(arrayList);
        printElements(hashSet);
    }

    // Generic method to print elements of any Collection
    public static <T> void printElements(Collection<T> collection) {
        for (T element : collection) {
            System.out.println(element);
        }
    }
}