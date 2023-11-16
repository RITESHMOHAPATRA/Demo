package org.example.service;

import org.example.dao.Storage;
import org.example.models.Building;
import org.example.models.Floor;

public class AddFloorService {
    public void addFloor(String buildingId, String floor, Storage s){
        Building b = s.getBuilding(buildingId);
        b.addFloor(new Floor(floor));
    }
}
