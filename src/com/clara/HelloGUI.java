package com.clara;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelloGUI extends JPanel{

    HelloGUI() {

        JButton button = new JButton("Click me!");
        add(button);


        JLabel helloLabel = new JLabel("Hello", JLabel.CENTER);
        add(helloLabel);


        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                helloLabel.setText("Click!");
            }
        });

    }

    public static void main(String[] args) {

        JFrame helloFrame = new JFrame();
        HelloGUI gui = new HelloGUI();
        helloFrame.setSize(200, 200);
        helloFrame.add(gui);
        helloFrame.setVisible(true);

    }
}
