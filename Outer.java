public class Outer {
    static class Nested {
        void display() {
            System.out.println("Static Nested Class");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Outer.Nested nestedObj = new Outer.Nested();
        nestedObj.display();
    }
}