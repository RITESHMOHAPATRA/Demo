package org.example.service;

import org.example.dao.Storage;
import org.example.models.Building;

public class AddBuildingService {
    public Building addBuilding(String buildingId){
        return new Building(buildingId);
    }
}
