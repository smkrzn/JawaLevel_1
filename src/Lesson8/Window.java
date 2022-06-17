package Lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window extends JFrame {
    private int count;
    public Window(){
        setTitle("Счетчик");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300, 300, 500, 500);
        Font font = new Font("Arial", Font.BOLD, 30);
        JLabel counterValueView = new JLabel();
        counterValueView.setFont(font);
        counterValueView.setHorizontalAlignment(SwingConstants.CENTER);
        add(counterValueView, BorderLayout.CENTER);
        counterValueView.setText(String.valueOf(count));
        JButton button1 = new JButton("<");
        button1.setFont(font);
        add(button1, BorderLayout.WEST);
        JButton button2 = new JButton(">");
        button2.setFont(font);
        add(button2, BorderLayout.EAST);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count--;
                counterValueView.setText(String.valueOf(count));
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count++;
                counterValueView.setText(String.valueOf(count));
            }
        });
        setVisible(true);
    }
}
