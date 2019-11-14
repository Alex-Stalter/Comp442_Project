package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CreateWindow extends JFrame{
    private JLabel labelUsername = new JLabel("Enter username: ");
    private JLabel labelPassword = new JLabel("Enter password: ");
    private JTextField textUsername = new JTextField(20);
    public JPasswordField fieldPassword = new JPasswordField(20);
    private JButton buttonLogin = new JButton("Login");
    public void loginWindow(){

    //Creating login screen for management system



        JPanel pane = new JPanel(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.insets = new Insets(10,10,10,10);
        constraints.gridx = 0;
        constraints.gridy = 0;
        pane.add(labelUsername, constraints);

        constraints.gridx = 1;
        pane.add(textUsername, constraints);

        constraints.gridx = 0;
        constraints.gridy = 1;
        pane.add(labelPassword, constraints);

        constraints.gridx = 1;
        pane.add(fieldPassword, constraints);

        constraints.gridx = 0;
        constraints.gridy = 2;
        constraints.gridwidth = 2;
        constraints.anchor = GridBagConstraints.CENTER;
        pane.add(buttonLogin, constraints);

        pane.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Login Panel"));
        setSize(new Dimension(500,500));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(pane);
        setVisible(true);




    }

}
