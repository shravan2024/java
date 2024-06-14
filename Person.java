package functions;

public class Person {
    private String name;
    private int age;

    // Default constructor
    public Person() {
        this.name = "Unknown";
        this.age = 0;
    }

    // Parameterized constructor with name
    public Person(String name) {
        this.name = name;
        this.age = 0;
    }

    // Parameterized constructor with name and age
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display person details
    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        // Using default constructor
        Person person1 = new Person();
        person1.display();

        // Using parameterized constructor with name
        Person person2 = new Person("Alice");
        person2.display();

        // Using parameterized constructor with name and age
        Person person3 = new Person("Bob", 25);
        person3.display();
    }
}
