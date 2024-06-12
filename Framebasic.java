import java.awt.*;

public class Framebasic {
    public static void main(String[] args) {
        Frame frame = new Frame("My Frame");
        frame.setSize(300, 200);
        frame.setLayout(new FlowLayout());

        Button button = new Button("Click me");
        frame.add(button);

        frame.setVisible(true);
    }
}