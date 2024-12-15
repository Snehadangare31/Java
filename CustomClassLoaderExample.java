import java.io.*;

public class CustomClassLoaderExample {
    public static void main(String[] args) {
        try {
            // Create an instance of the custom class loader
            CustomClassLoader loader = new CustomClassLoader();
            
            // Dynamically load a class (e.g., MyClass.class in the same directory)
            Class<?> loadedClass = loader.loadClass("MyClass");
            System.out.println("Class " + loadedClass.getName() + " loaded successfully.");

            // Create an instance of the loaded class
            Object obj = loadedClass.getDeclaredConstructor().newInstance();
            System.out.println("Instance created: " + obj);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class CustomClassLoader extends ClassLoader {
    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        try {
            // Specify the path to the .class file
            String filePath = name + ".class";
            File file = new File(filePath);
            if (!file.exists()) {
                throw new ClassNotFoundException("Class file not found: " + filePath);
            }

            // Read the class file into a byte array
            byte[] classData = new byte[(int) file.length()];
            try (FileInputStream fis = new FileInputStream(file)) {
                fis.read(classData);
            }

            // Define the class using the byte array
            return defineClass(name, classData, 0, classData.length);
        } catch (IOException e) {
            throw new ClassNotFoundException("Error reading class file", e);
        }
    }
}
