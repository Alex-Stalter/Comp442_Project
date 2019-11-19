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
    private JButton logoutButton = new JButton("Logout");
    private JPanel loginPane = new JPanel(new GridBagLayout());
    private JPanel registerPane = new JPanel(new GridBagLayout());
    private JPanel managerPane = new JPanel(new GridBagLayout());
    private JPanel currentPane = loginPane;

    public void loginWindow(){

    //Creating login screen for management system




        GridBagConstraints constraints = new GridBagConstraints();
        constraints.insets = new Insets(0,0,0,0);
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
        registerButton.addActionListener(this);


        loginPane.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Login Panel"));

        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        setSize(screen.width,screen.height);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(loginPane);

        setVisible(true);




    }

    private void setRegisterPane(){

        registerPane.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Register"));
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.insets = new Insets(0,0,0,0);
        registerPane.add(logoutButton,constraints);
        logoutButton.addActionListener(this);


    }

    private void setManagerPane(){
        managerPane.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Manager"));
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.insets = new Insets(0,0,0,0);
        managerPane.add(logoutButton,constraints);
        logoutButton.addActionListener(this);


    }


    @Override
    public void actionPerformed(ActionEvent e) {
        StringBuilder password= new StringBuilder();
        for(int i =0;i<fieldPassword.getPassword().length;i++){
            password.append(fieldPassword.getPassword()[i]);
        }
        if(textUsername.getText().equals("Manager")&&password.toString().equals("manager")&&e.getSource()==buttonLogin){
            currentPane.setVisible(false);
            setManagerPane();
            add(managerPane);
            currentPane = managerPane;
            managerPane.setVisible(true);

        }else if(e.getSource()==exitButton){

            dispose();

        }else if(e.getSource()==registerButton){
            currentPane.setVisible(false);

            setRegisterPane();
            add(registerPane);
            currentPane = registerPane;
            registerPane.setVisible(true);
        }else if(e.getSource()==logoutButton){
            currentPane.setVisible(false);

            loginWindow();
            currentPane = loginPane;
            loginPane.setVisible(true);

        }

    }
}
