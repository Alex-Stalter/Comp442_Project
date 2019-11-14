package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CreateWindow extends JFrame{

    public void initializeWindow(){

    //Creating login screen for management system
        JPasswordField password = new JPasswordField(10);
        password.setAlignmentX(Component.CENTER_ALIGNMENT);
        JPanel pane = new JPanel(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.insets = new Insets(10,10,10,10);

        pane.add(password);
        pane.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Login Panel"));
        setSize(new Dimension(500,500));
        setDefaultCloseOperation(3);
        add(pane);
        setVisible(true);




    }

}
