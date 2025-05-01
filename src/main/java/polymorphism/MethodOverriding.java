package polymorphism;

public class MethodOverriding {
    public static void main(String[] args) {

        Child C = new Child();
        System.out.println("Output from child class: " + C.addition(10, 20)); // Calls the overloaded method in Child class
        System.out.println("Output from parent class: " + C.addition(11.9f)); // Calls the overloaded method from Parent class
        System.out.println("Output from parent class: " + C.addition(10)); // Calls the overloaded method from Parent class
    }
}

// Parent class with overloaded methods
class Parent {

    // No parameters
    void Addition() {
        System.out.println("No arguments passed to Addition.");
    }

    // Overloaded method with a single int argument
    int Addition(int a) {
        return a + 20;
    }

    // Overloaded method with a single float argument
    float addition(float a) {
        return a + 20;
    }
}

// Child class extends Parent class
class Child extends Parent {

    // Method in the Child class that overloads the method in Parent class with two int parameters
    int addition(int a, int b) {
        return a + b;
    }
}
