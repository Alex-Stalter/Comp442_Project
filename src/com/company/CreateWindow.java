package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class CreateWindow extends JFrame implements ActionListener {
    public Owner owner = new Owner();
    private JLabel labelUsername = new JLabel("Enter username: ");
    private JLabel labelPassword = new JLabel("Enter password: ");
    private JLabel wrongPassword = new JLabel(" ");
    private JLabel weeklyCost = new JLabel("Weekly cost: $"+owner.cost);
    private JLabel weeklyIncome = new JLabel("Weekly gross income: $"+owner.income);
    private JLabel weeklyNet = new JLabel("Weekly net income: $"+(owner.income-owner.cost));
    private JLabel managerRatio = new JLabel("Current Managers"+owner.managerNumber+"/"+owner.maxManager);
    private JLabel maintRatio = new JLabel("Current Maintainers"+owner.maintNumber+"/"+owner.maxMaint);
    private JLabel cleanerRatio = new JLabel("Current Cleaners"+owner.cleanerNumber+"/"+owner.maxCleaner);
    private JLabel booking = new JLabel("Please select one of the options for room.");
    private JButton bookingRoomLower = new JButton("Low Value Room");
    private JButton bookingRoomLM = new JButton("Low-Med Value Room");
    private JButton bookingRoomMid = new JButton("Med Value Room");
    private JButton bookingRoomMH = new JButton("Med-High Value Room");
    private JButton bookingRoomHigh = new JButton("High Value Room");
    private JTextField textUsername = new JTextField(20);
    private JPasswordField fieldPassword = new JPasswordField(20);
    private JButton buttonLogin = new JButton("Login");
    private JButton exitButton = new JButton("Exit");
    private JButton logoutButton = new JButton("Logout");
    private JButton hireManager = new JButton("Hire Manager");
    private JButton hireCleaner = new JButton("Hire Cleaner");
    private JButton hireMaint = new JButton("Hire Maint");
    private JButton fireManager = new JButton("Fire Manager");
    private JButton fireCleaner = new JButton("Fire Cleaner");
    private JButton fireMaint = new JButton("Fire Maint");
    private JPanel loginPane = new JPanel(new GridBagLayout());
    private JPanel managerPane = new JPanel(new GridBagLayout());
    private JPanel ownerPane = new JPanel(new GridBagLayout());
    private JPanel maintPane = new JPanel(new GridBagLayout());
    private JPanel cleanerPane = new JPanel(new GridBagLayout());
    private JPanel currentPane = loginPane;



    //This function is called to create the first panel of the program
    public void loginWindow(){

        GridBagConstraints constraints = new GridBagConstraints();
        
        constraints.insets = new Insets(0,0,0,0);
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




        constraints.gridy = 3;
        loginPane.add(wrongPassword, constraints);

        buttonLogin.addActionListener(this);
        exitButton.addActionListener(this);



        loginPane.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Login Panel"));

        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        setSize(screen.width,screen.height);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        add(loginPane);
        setVisible(true);




    }

    private void setOwnerPane(){
        ownerPane.removeAll();
        ownerPane.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Owner"));
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.insets = new Insets(0,0,0,0);

        constraints.gridx = 0;
        constraints.gridy = 2;
        ownerPane.add(managerRatio,constraints);

        constraints.gridx = 0;
        constraints.gridy = 1;
        ownerPane.add(cleanerRatio,constraints);

        constraints.gridx = 0;
        constraints.gridy = 3;
        ownerPane.add(maintRatio,constraints);

        constraints.gridx = 3;
        constraints.gridy = 4;
        ownerPane.add(logoutButton,constraints);

        constraints.gridx = 1;
        constraints.gridy = 1;
        ownerPane.add(hireCleaner, constraints);

        constraints.gridx = 1;
        constraints.gridy = 2;
        ownerPane.add(hireManager, constraints);

        constraints.gridx = 1;
        constraints.gridy = 3;
        ownerPane.add(hireMaint, constraints);

        constraints.gridx = 2;
        constraints.gridy = 1;
        ownerPane.add(fireCleaner, constraints);

        constraints.gridx = 2;
        constraints.gridy = 2;
        ownerPane.add(fireManager, constraints);

        constraints.gridx = 2;
        constraints.gridy = 3;
        ownerPane.add(fireMaint, constraints);

        constraints.gridx = 3;
        constraints.gridy = 1;
        ownerPane.add(weeklyCost, constraints);

        constraints.gridx = 3;
        constraints.gridy = 2;
        ownerPane.add(weeklyIncome, constraints);

        constraints.gridx = 3;
        constraints.gridy = 3;
        ownerPane.add(weeklyNet, constraints);


        hireCleaner.addActionListener(this);
        hireManager.addActionListener(this);
        hireMaint.addActionListener(this);
        fireCleaner.addActionListener(this);
        fireMaint.addActionListener(this);
        fireManager.addActionListener(this);
        logoutButton.addActionListener(this);

    }
    private void setManagerPane(){
        managerPane.removeAll();
        managerPane.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Manager"));
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.insets = new Insets(0,0,0,0);


        constraints.gridx = 0;
        constraints.gridy = 0;
        managerPane.add(booking, constraints);

        constraints.gridx = 2;
        constraints.gridy = 6;
        managerPane.add(logoutButton,constraints);

        constraints.gridx = 1;
        constraints.gridy = 1;
        managerPane.add(bookingRoomLower,constraints);

        constraints.gridx = 1;
        constraints.gridy = 2;
        managerPane.add(bookingRoomLM,constraints);

        constraints.gridx = 1;
        constraints.gridy = 3;
        managerPane.add(bookingRoomMid,constraints);

        constraints.gridx = 1;
        constraints.gridy = 4;
        managerPane.add(bookingRoomMH,constraints);

        constraints.gridx = 1;
        constraints.gridy = 5;
        managerPane.add(bookingRoomHigh,constraints);

        bookingRoomLower.addActionListener(this);
        bookingRoomLM.addActionListener(this);
        bookingRoomMid.addActionListener(this);
        bookingRoomMH.addActionListener(this);
        bookingRoomHigh.addActionListener(this);
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

        }else if(textUsername.getText().equals(owner.username)&&password.toString().equals(owner.password)&&e.getSource()==buttonLogin){
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

        }else if(e.getSource()==exitButton){

            dispose();

        }else if(e.getSource()==logoutButton){
            currentPane.setVisible(false);
            remove(currentPane);
            revalidate();
            loginWindow();
            currentPane = loginPane;
            add(loginPane);
            loginPane.setVisible(true);
            wrongPassword.setText("");


        }else if(e.getSource()==buttonLogin){

            wrongPassword.setText("Invalid Username or Password");
            revalidate();

        }else if(e.getSource()==hireMaint){
            owner.hireMaint();
            weeklyCost.setText("Cost: "+owner.cost);
            maintRatio.setText("Current Maintainers"+owner.maintNumber+"/"+owner.maxMaint);
            weeklyNet.setText("Weekly net income: $"+(owner.income-owner.cost));
            revalidate();
        }else if(e.getSource()==hireCleaner){
            owner.hireCleaner();
            weeklyCost.setText("Cost: "+owner.cost);
            cleanerRatio.setText("Current Cleaners"+owner.cleanerNumber+"/"+owner.maxCleaner);
            weeklyNet.setText("Weekly net income: $"+(owner.income-owner.cost));
            revalidate();
        }else if(e.getSource()==hireManager){
            owner.hireManager();
            weeklyCost.setText("Cost: "+owner.cost);
            managerRatio.setText("Current Managers"+owner.managerNumber+"/"+owner.maxManager);
            weeklyNet.setText("Weekly net income: $"+(owner.income-owner.cost));
            revalidate();
        }else if(e.getSource()==fireManager){
            owner.fireManager();
            weeklyCost.setText("Cost: "+owner.cost);
            managerRatio.setText("Current Managers"+owner.managerNumber+"/"+owner.maxManager);
            weeklyNet.setText("Weekly net income: $"+(owner.income-owner.cost));
            revalidate();
        }else if(e.getSource()==fireMaint){
            owner.fireMaint();
            weeklyCost.setText("Cost: "+owner.cost);
            maintRatio.setText("Current Maintainers"+owner.maintNumber+"/"+owner.maxMaint);
            weeklyNet.setText("Weekly net income: $"+(owner.income-owner.cost));
            revalidate();
        }else if(e.getSource()==fireCleaner){
            owner.fireCleaner();
            weeklyCost.setText("Cost: "+owner.cost);
            cleanerRatio.setText("Current Cleaners"+owner.cleanerNumber+"/"+owner.maxCleaner);
            weeklyNet.setText("Weekly net income: $"+(owner.income-owner.cost));
            revalidate();
        }else if(e.getSource()==bookingRoomLower){
            owner.managers[0].bookRoom(1,1);
            owner.calculateIncome();
            weeklyIncome.setText("Weekly gross income: $"+owner.income);
        }else if(e.getSource()==bookingRoomLM){
            owner.managers[0].bookRoom(2,1);
            owner.calculateIncome();
            weeklyIncome.setText("Weekly gross income: $"+owner.income);
        }else if(e.getSource()==bookingRoomMid){
            owner.managers[0].bookRoom(3,1);
            owner.calculateIncome();
            weeklyIncome.setText("Weekly gross income: $"+owner.income);
        }else if(e.getSource()==bookingRoomMH){
            owner.managers[0].bookRoom(4,1);
            owner.calculateIncome();
            weeklyIncome.setText("Weekly gross income: $"+owner.income);
        }else if(e.getSource()==bookingRoomHigh){
            owner.managers[0].bookRoom(5,1);
            owner.calculateIncome();
            weeklyIncome.setText("Weekly gross income: $"+owner.income);
        }

    }
}
