package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;

public class CreateWindow extends JFrame implements ActionListener{
    private JLabel labelUsername = new JLabel("Enter username: ");
    private JLabel labelPassword = new JLabel("Enter password: ");
    private JTextField textUsername = new JTextField(20);
    public JPasswordField fieldPassword = new JPasswordField(20);
    private JButton buttonLogin = new JButton("Login");
    private JPanel loginPane = new JPanel(new GridBagLayout());
    public void loginWindow(){

    //Creating login screen for management system




        GridBagConstraints constraints = new GridBagConstraints();
        constraints.insets = new Insets(10,10,10,10);
        constraints.gridx = 0;
        constraints.gridy = 0;
        loginPane.add(labelUsername, constraints);

        constraints.gridx = 1;
        loginPane.add(textUsername, constraints);

        constraints.gridx = 0;
        constraints.gridy = 1;
        loginPane.add(labelPassword, constraints);

        constraints.gridx = 1;
        loginPane.add(fieldPassword, constraints);

        constraints.gridx = 0;
        constraints.gridy = 2;
        constraints.gridwidth = 2;
        constraints.anchor = GridBagConstraints.CENTER;
        loginPane.add(buttonLogin, constraints);

        buttonLogin.addActionListener(this);


        loginPane.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Login Panel"));
        setSize(new Dimension(500,500));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(loginPane);
        setVisible(true);




    }


    @Override
    public void actionPerformed(ActionEvent e) {
        StringBuilder password= new StringBuilder();
        for(int i =0;i<fieldPassword.getPassword().length;i++){
            password.append(fieldPassword.getPassword()[i]);
        }
        if(textUsername.getText().equals("Manager")&&password.toString().equals("manager")){
            loginPane.removeAll();
            JLabel welcome = new JLabel("Welcome Manager!");
            loginPane.add(welcome);
            revalidate();
            repaint();
        }

    }
}
