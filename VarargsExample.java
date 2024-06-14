package functions;

public class VarargsExample {

	// Method to print integers
    public void printNumbers(int... numbers) {
        System.out.print("Integers:");
        for (int num : numbers) {
            System.out.print(" " + num);
        }
        System.out.println();
    }

    // Method to print strings
    public void printStrings(String... strings) {
        System.out.print("Strings:");
        for (String str : strings) {
            System.out.print(" " + str);
        }
        System.out.println();
    }

    // Method to print both integers and strings
    public void printAll(Object... objects) {
        System.out.print("All:");
        for (Object obj : objects) {
            System.out.print(" " + obj);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        VarargsExample example = new VarargsExample();

        // Call the overloaded methods with different numbers of arguments
        example.printNumbers(1, 2, 3);
        example.printStrings("Hello", "World");
        example.printAll(1, "Java", 3.14);
    }
}
