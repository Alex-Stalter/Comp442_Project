package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;

public class CreateWindow extends JFrame implements ActionListener{
    private JLabel labelUsername = new JLabel("Enter username: ");
    private JLabel labelPassword = new JLabel("Enter password: ");
    private JTextField textUsername = new JTextField(20);
    private JPasswordField fieldPassword = new JPasswordField(20);
    private JButton buttonLogin = new JButton("Login");
    private JButton exitButton = new JButton("Exit");
    private JButton registerButton = new JButton("Register");
    private JPanel loginPane = new JPanel(new GridBagLayout());
    private JPanel registerPane = new JPanel(new GridBagLayout());

    public void loginWindow(){

    //Creating login screen for management system




        GridBagConstraints constraints = new GridBagConstraints();
        constraints.insets = new Insets(10,10,10,10);
        constraints.gridx = 0;
        constraints.gridy = 0;
        loginPane.add(labelUsername, constraints);
        //registerPane.add(labelUsername, constraints);

        constraints.gridx = 1;
        loginPane.add(textUsername, constraints);
        //registerPane.add(textUsername, constraints);

        constraints.gridx = 0;
        constraints.gridy = 1;
        loginPane.add(labelPassword, constraints);
        //registerPane.add(labelPassword, constraints);

        constraints.gridx = 1;
        loginPane.add(fieldPassword, constraints);
        //registerPane.add(fieldPassword, constraints);

        constraints.gridx = 1;
        constraints.gridy = 2;
        constraints.gridwidth = 0;
        constraints.anchor = GridBagConstraints.WEST;
        loginPane.add(buttonLogin, constraints);

        constraints.gridx = 1;
        constraints.gridy = 2;
        constraints.gridwidth = 0;
        //constraints.ipady = 1;

        constraints.anchor = GridBagConstraints.EAST;
        loginPane.add(exitButton, constraints);

        constraints.gridx = 1;
        constraints.gridy = 2;
        constraints.gridwidth = 0;
        constraints.ipadx = 1;

        constraints.anchor = GridBagConstraints.CENTER;
        loginPane.add(registerButton, constraints);

        buttonLogin.addActionListener(this);
        exitButton.addActionListener(this);


        loginPane.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Login Panel"));
        registerPane.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Register"));
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        setSize(screen.width,screen.height);
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
        if(textUsername.getText().equals("Manager")&&password.toString().equals("manager")&&e.getSource()==buttonLogin){
            loginPane.removeAll();
            JLabel welcome = new JLabel("Welcome Manager!");
            loginPane.add(welcome);
            revalidate();
            repaint();
        }else if(e.getSource()==exitButton){

            dispose();

        }else if(e.getSource()==registerButton){
            loginPane.setVisible(false);
            add(registerPane);
            registerPane.setVisible(true);
        }

    }
}
