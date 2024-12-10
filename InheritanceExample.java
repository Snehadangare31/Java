// Base class
class Animal {
    String name;
    int age;

    // Constructor for the base class
    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display general information about the animal
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age + " years");
    }

    // Method to make a sound
    void makeSound() {
        System.out.println("This animal makes a sound.");
    }
}

// Derived class
class Dog extends Animal {
    String breed;

    // Constructor for the derived class
    Dog(String name, int age, String breed) {
        super(name, age); // Call the constructor of the base class
        this.breed = breed;
    }

    // Overriding the makeSound method
    @Override
    void makeSound() {
        System.out.println(name + " barks: Woof! Woof!");
    }

    // Additional method specific to Dog
    void displayBreed() {
        System.out.println("Breed: " + breed);
    }
}

// Main class
public class InheritanceExample {
    public static void main(String[] args) {
        // Create an instance of the Dog class
        Dog myDog = new Dog("Buddy", 3, "Golden Retriever");

        // Display the dog's details
        myDog.displayInfo();
        myDog.displayBreed();
        myDog.makeSound();
    }
}
