public class TypeConversionExample {
    public static void main(String[] args) {
        // Type Conversion (Widening)
        int x = 10;
        double y = x; // Automatic conversion of int to double
        System.out.println("x: " + x + ", y: " + y);

        // Type Casting (Narrowing)
        double z = 10.5;
        int w = (int) z; // Explicit casting of double to int
        System.out.println("z: " + z + ", w: " + w);
    }
}