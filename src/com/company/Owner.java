package com.company;

import java.util.Arrays;

public class Owner {
    public String password = "Owner";
    public String username = "owner";
    public Manager[] managers = new Manager[4];
    public int managerNumber = 0;
    public Maint[] maint = new Maint[6];
    public int maintNumber = 0;
    public Cleaner[] cleaner = new Cleaner[8];
    public int cleanerNumber = 0;
    public Customer[] customer = new Customer[25];
    public int customerNumber = 0;
    public Room[] hotelRooms = new Room[25];
    public Room[] bookedRooms = new Room[25];
    public int roomValueMult = 1;

    Owner(){
        createRooms();
        Manager primaryManager = new Manager();
        Manager assistantManager = new Manager();
        managers[0]=primaryManager;
        managerNumber++;
        managers[1]=assistantManager;
        managerNumber++;
        Maint maint01 = new Maint();
        maintNumber++;
        maint[0]=maint01;
        Cleaner cleaner01 = new Cleaner();
        cleanerNumber++;
        cleaner[0]=cleaner01;

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

}
