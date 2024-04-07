class Box {
    double width, height, depth;

    // Constructor with no parameters
    Box() {
        width = height = depth = 0;
    }

    // Constructor with one parameter
    Box(double len) {
        width = height = depth = len;
    }

    // Constructor with three parameters
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    double volume() {
        return width * height * depth;
    }
}

public class ConstructorOverloadingExample {
    public static void main(String[] args) {
        Box box1 = new Box();
        Box box2 = new Box(5);
        Box box3 = new Box(3, 4, 5);

        System.out.println("Box1 volume: " + box1.volume());
        System.out.println("Box2 volume: " + box2.volume());
        System.out.println("Box3 volume: " + box3.volume());
    }
}