package Games;

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {
    private TextField input = new TextField();
    private Font font = new Font("Arial", Font.BOLD, 22);
    private JLabel label = new JLabel("Введите число: ");
    
    public Window(){
        this.setTitle("Быки и коровы");
        this.setBounds(600,250,500,500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        setVisible(true);
    }
}
