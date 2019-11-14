package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        CreateWindow main = new CreateWindow();
        main.loginWindow();
        if(Arrays.toString(main.fieldPassword.getPassword()).equals("hello")){

            System.out.println("correct password");

        }


    }
}
