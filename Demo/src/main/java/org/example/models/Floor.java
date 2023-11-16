package org.example.models;

import java.util.ArrayList;
import java.util.List;

public class Floor {
    String floorId;
    List<Room> confRooms;

    public Floor(String id){
        this.floorId = id;
        this.confRooms = new ArrayList<>();
    }

    public String getFloorId() {
        return floorId;
    }

    public List<Room> getConfRooms() {
        return confRooms;
    }

    public void addConfRoom(Room r){
        this.confRooms.add(r);
    }
}
