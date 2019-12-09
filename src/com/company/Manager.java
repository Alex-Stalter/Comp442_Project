package com.company;

public class Manager {

    public Room[] hotelRoom ;

    Manager(Room[] hotelRooms){
        hotelRoom = hotelRooms;
    }

    public void bookRoom(int value,int days){
        if(value==0){

        }else if(value==1){
            for(int i = 0;i<5;i++){
                if(!hotelRoom[i].booked){
                    hotelRoom[i].booked=true;
                    hotelRoom[i].bookedDays = days;
                }
            }
        }else if(value==2){
            for(int i = 5;i<10;i++){
                hotelRoom[i].booked=true;
                hotelRoom[i].bookedDays = days;
            }
        }else if(value==3){
            for(int i = 10;i<15;i++){
                hotelRoom[i].booked=true;
                hotelRoom[i].bookedDays = days;
            }
        }else if(value==4){
            for(int i = 15;i<20;i++){
                hotelRoom[i].booked=true;
                hotelRoom[i].bookedDays = days;
            }
        }else if(value==5){
            for(int i = 20;i<25;i++){
                hotelRoom[i].booked=true;
                hotelRoom[i].bookedDays = days;
            }
        }

    }

}
