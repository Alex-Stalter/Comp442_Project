package com.company;


public class Manager {
    public String password = "Manager";
    public String username = "manager";
    public int maxRooms = 25;
    public int maxMaint = 6;
    public int maxCleaner = 8;
    public int maxCustomer = 25;

    public Maint[] maint = new Maint[maxMaint];
    public int maintNumber = 0;
    public Cleaner[] cleaner = new Cleaner[maxCleaner];
    public int cleanerNumber = 0;
    public Customer[] customer = new Customer[maxCustomer];
    public int customerNumber = 0;
    public Room[] hotelRooms = new Room[25];
    public int roomValueMult = 1;
    public int cost = 0;
    public int income = 0;

    Manager(){
        createRooms();
        Maint maint01 = new Maint();
        maintNumber++;
        maint[0]=maint01;
        Cleaner cleaner01 = new Cleaner();
        cleanerNumber++;
        cleaner[0]=cleaner01;
        calculateCost();
        calculateIncome();

    }

    public void createRooms(){

        for(int i = 0; i < 25;i++){
            Room room = new Room();
            room.roomDesc = "Room: "+(i+1);
            if(i<5){
                room.roomNumber = i+1;
                room.roomValue = 500*roomValueMult;
            }else if(i<10){
                room.roomNumber = i+1;
                room.roomValue = 600*roomValueMult;

            }else if(i<15){
                room.roomNumber = i+1;
                room.roomValue = 700*roomValueMult;
            }else if(i<20){
                room.roomNumber = i+1;
                room.roomValue = 800*roomValueMult;
            }else{
                room.roomNumber = i+1;
                room.roomValue = 900*roomValueMult;
            }
            hotelRooms[i]=room;

        }

    }
    public void hireMaint(){
        if(maintNumber<maxMaint){
            Maint maintainer = new Maint();
            maint[maintNumber] = maintainer;
            maintNumber++;
        }
        calculateCost();
    }

    public void hireCleaner(){
        if(cleanerNumber<maxCleaner){
            Cleaner newCleaner = new Cleaner();
            cleaner[cleanerNumber] = newCleaner;
            cleanerNumber++;

        }
        calculateCost();
    }
    public void fireMaint(){
        if(maintNumber>0){
            maint[maintNumber-1] = null;
            maintNumber--;
        }
        calculateCost();


    }

    public void fireCleaner(){
        if(cleanerNumber>0){
            cleaner[cleanerNumber-1] = null;
            cleanerNumber--;
        }
        calculateCost();
    }
    public void calculateCost(){
        cost = 150*maintNumber + 150*cleanerNumber;
    }
    public void calculateIncome(){

        for (Room booked: hotelRooms) {

            if(booked.booked){
                income+=booked.roomValue;
            }

        }
    }

}
