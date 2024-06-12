import java.awt.*;
import java.awt.event.*;

public class CardLayoutExample extends Frame implements ActionListener {
    private CardLayout cardLayout;
    private Panel cardPanel;
    private Button prevButton, nextButton;

    public CardLayoutExample() {
        super("Card Layout Example");
        setLayout(new FlowLayout());

        // Create CardLayout and card panel
        cardLayout = new CardLayout();
        cardPanel = new Panel(cardLayout);

        // Create cards (panels)
        Panel card1 = new Panel();
        card1.add(new Label("Card 1"));
        Panel card2 = new Panel();
        card2.add(new Label("Card 2"));
        Panel card3 = new Panel();
        card3.add(new Label("Card 3"));

        // Add cards to the card panel
        cardPanel.add(card1, "Card 1");
        cardPanel.add(card2, "Card 2");
        cardPanel.add(card3, "Card 3");

        // Create navigation buttons
        prevButton = new Button("Previous");
        nextButton = new Button("Next");
        prevButton.addActionListener(this);
        nextButton.addActionListener(this);

        // Add components to the frame
        add(cardPanel);
        add(prevButton);
        add(nextButton);

        setSize(300, 200);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == prevButton) {
            cardLayout.previous(cardPanel);
        } else if (e.getSource() == nextButton) {
            cardLayout.next(cardPanel);
        }
    }

    public static void main(String[] args) {
        new CardLayoutExample();
    }
}