package org.example.models;

import java.util.ArrayList;
import java.util.List;

public class Building {
    String id;
    List<Floor> floors;

    public Building(String id){
        this.id = id;
        this.floors = new ArrayList<>();
    }

    public void addFloor(Floor f){
        this.floors.add(f);
    }

    public String getId() {
        return id;
    }

    public List<Floor> getFloors() {
        return floors;
    }
}
