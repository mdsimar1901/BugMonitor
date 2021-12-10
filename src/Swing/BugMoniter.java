package Swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BugMoniter {

    private JPanel panel1;
    private JButton button_num;
    private JLabel bug_monitor;

    public BugMoniter() {
        button_num.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Hello World");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("BugMoniter");
        frame.setContentPane(new BugMoniter().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}

