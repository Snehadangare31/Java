// Example of Encapsulation in Java
class Student {
    // Private variables - restrict direct access
    private String name;
    private int age;

    // Public getter method for 'name'
    public String getName() {
        return name;
    }

    // Public setter method for 'name'
    public void setName(String name) {
        this.name = name;
    }

    // Public getter method for 'age'
    public int getAge() {
        return age;
    }

    // Public setter method for 'age'
    public void setAge(int age) {
        if (age > 0) { // Adding a validation condition
            this.age = age;
        } else {
            System.out.println("Age must be positive!");
        }
    }
}

public class EncapsulationExample {
    public static void main(String[] args) {
        // Create an object of Student class
        Student student = new Student();

        // Set values using setter methods
        student.setName("John Doe");
        student.setAge(20);

        // Get values using getter methods
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());

        // Try setting an invalid age
        student.setAge(-5); // This will display the validation message
    }
}
