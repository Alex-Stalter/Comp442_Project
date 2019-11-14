package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CreateWindow {

    public void initalizeWindow(String title){
        JLabel emptyLabel = new JLabel("");
        emptyLabel.setPreferredSize(new Dimension(175,100));
        JFrame frame = new JFrame(title);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(emptyLabel, BorderLayout.CENTER);

        frame.pack();
        frame.setVisible(true);
    }
}
