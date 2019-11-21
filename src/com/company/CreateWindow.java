package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;

public class CreateWindow extends JFrame implements ActionListener{
    private JLabel labelUsername = new JLabel("Enter username: ");
    private JLabel labelPassword = new JLabel("Enter password: ");
    private JLabel wrongPassword = new JLabel(" ");
  /*  private JLabel a = new JLabel("a     asdawdasdawdasfaefsadawdqwdsad");
    private JLabel b = new JLabel("b     ");
    private JLabel c = new JLabel("c     ");
    private JLabel d = new JLabel("d     ");
    private JLabel e = new JLabel("e     ");*/
    private JTextField textUsername = new JTextField(20);
    private JPasswordField fieldPassword = new JPasswordField(20);
    private JButton buttonLogin = new JButton("Login");
    private JButton exitButton = new JButton("Exit");
    private JButton registerButton = new JButton("Register");
    private JButton logoutButton = new JButton("Logout");
    private JPanel loginPane = new JPanel(new GridBagLayout());
    private JPanel registerPane = new JPanel(new GridBagLayout());
    private JPanel managerPane = new JPanel(new GridBagLayout());
    private JPanel ownerPane = new JPanel(new GridBagLayout());
    private JPanel maintPane = new JPanel(new GridBagLayout());
    private JPanel cleanerPane = new JPanel(new GridBagLayout());
    private JPanel customerPane = new JPanel(new GridBagLayout());
    private JPanel currentPane = loginPane;


    //This function is called to create the first panel of the program
    public void loginWindow(){





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

        constraints.gridx = 1;
        constraints.gridy = 3;
        loginPane.add(wrongPassword, constraints);

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
        registerPane.removeAll();
        registerPane.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Register"));
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.insets = new Insets(0,0,0,0);

        registerPane.add(logoutButton,constraints);
        logoutButton.addActionListener(this);


    }
    private void setOwnerPane(){
        ownerPane.removeAll();
        ownerPane.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Owner"));
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.insets = new Insets(0,0,0,0);
        ownerPane.add(logoutButton,constraints);

        logoutButton.addActionListener(this);

    }
    private void setManagerPane(){
        managerPane.removeAll();
        managerPane.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Manager"));
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.insets = new Insets(0,0,0,0);
        managerPane.add(logoutButton,constraints);
        logoutButton.addActionListener(this);


    }

    private void setMaintPane(){
        maintPane.removeAll();
        maintPane.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Maintenance"));
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.insets = new Insets(0,0,0,0);
        maintPane.add(logoutButton,constraints);
        logoutButton.addActionListener(this);
    }

    private void setCleanerPane(){
        cleanerPane.removeAll();
        cleanerPane.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Cleaner"));
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.insets = new Insets(0,0,0,0);
        cleanerPane.add(logoutButton,constraints);
        logoutButton.addActionListener(this);

    }
    private void setCustomerPane(){
        customerPane.removeAll();
        customerPane.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Customer"));
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.insets = new Insets(0,0,0,0);
        customerPane.add(logoutButton,constraints);
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
            wrongPassword.setText("");

        }else if(textUsername.getText().equals("Owner")&&password.toString().equals("owner")&&e.getSource()==buttonLogin){
            currentPane.setVisible(false);
            setOwnerPane();
            add(ownerPane);
            currentPane = ownerPane;
            ownerPane.setVisible(true);
            wrongPassword.setText("");

        }else if(textUsername.getText().equals("Cleaner")&&password.toString().equals("cleaner")&&e.getSource()==buttonLogin){
            currentPane.setVisible(false);
            setCleanerPane();
            add(cleanerPane);
            currentPane=cleanerPane;
            cleanerPane.setVisible(true);
            wrongPassword.setText("");

        }else if(textUsername.getText().equals("Maint")&&password.toString().equals("maint")&&e.getSource()==buttonLogin){
            currentPane.setVisible(false);
            setMaintPane();
            add(maintPane);
            currentPane=maintPane;
            maintPane.setVisible(true);
            wrongPassword.setText("");

        }else if(textUsername.getText().equals("Customer")&&password.toString().equals("customer")&&e.getSource()==buttonLogin){
            currentPane.setVisible(false);
            setCustomerPane();
            add(customerPane);
            currentPane=customerPane;
            customerPane.setVisible(true);
            wrongPassword.setText("");

        }else if(e.getSource()==exitButton){

            dispose();

        }else if(e.getSource()==registerButton){
            currentPane.setVisible(false);

            setRegisterPane();
            add(registerPane);
            currentPane = registerPane;
            registerPane.setVisible(true);
            wrongPassword.setText("");

        }else if(e.getSource()==logoutButton){
            currentPane.setVisible(false);

            loginWindow();
            currentPane = loginPane;
            loginPane.setVisible(true);
            wrongPassword.setText("");


        }else if(e.getSource()==buttonLogin){

            wrongPassword.setText("Invalid Username or Password");
            revalidate();

        }

    }
}
