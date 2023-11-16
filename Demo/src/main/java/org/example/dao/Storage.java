package org.example.dao;

import org.example.models.Building;
import org.example.models.RoomBooking;
import org.example.models.User;

import java.util.*;

public class Storage {
    Map<User, List<RoomBooking>> roomBookingMap;
    List<Building> buildingList;

    List<User> users;
    public Storage() {
        this.roomBookingMap = new HashMap<>();
        this.buildingList = new ArrayList<>();
        this.users = new ArrayList<>();
    }

    public  Building getBuilding(String id){
        for(Building b : buildingList){
            if(b.getId().equals(id)){
                return  b;
            }
        }
       return  null;
    }

    public  User getUser(String id){
        for(User u : users){
            if(u.getUserId().equals(id)){
                return  u;
            }
        }
        return  null;
    }

    public List<Building> getBuildingList() {
        return buildingList;
    }

    public List<User> getUsers() {
        return users;
    }

    public Map<User, List<RoomBooking>> getRoomBookingMap() {
        return roomBookingMap;
    }

    public void addBooking(String userId, RoomBooking booking) {
        User u = getUser(userId);
        List<RoomBooking> bookings = getRoomBookingMap().get(u);
        if(Objects.isNull(bookings)){
            bookings = new ArrayList<>();
        }
        bookings.add(booking);
        roomBookingMap.put(u,bookings);
    }

    public void  addBuilding(Building b){
        this.buildingList.add(b);
    }
}
