package org.example.service;

import org.example.dao.Storage;
import org.example.models.RoomBooking;

public class RoomBookingService {
    public void bookRoom(String userId,String slot, String buildingId, String floor, String roomId, Storage s){
        RoomBooking booking = new RoomBooking();
        booking.setUserId(userId);
        String[] split = slot.split(":");
        booking.setBookedFrom(Integer.parseInt(split[0]));
        booking.setBookedTill(Integer.parseInt(split[1]));
        if(booking.getBookedTill()-booking.getBookedFrom()>12){
            System.out.println("booking time cannot be more than 24 hrs");
            return;
        }
        booking.setBuildingId(buildingId);
        booking.setRoomId(roomId);
        booking.setFloorId(floor);
        s.addBooking(userId,booking);

    }
}
