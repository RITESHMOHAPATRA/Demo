package org.example.service;

import org.example.dao.Storage;
import org.example.models.Building;
import org.example.models.Floor;
import org.example.models.Room;

import java.util.Objects;

public class AddConferenceRoomService {

    public void addRoom(String buildingId,String floorId , Room room, Storage s){
        Building b  = s.getBuilding(buildingId);
        if(Objects.nonNull(b)){
            for(Floor f : b.getFloors()){
                if(floorId.equals(f.getFloorId())){
                    f.addConfRoom(room);
                }
            }
        }
    }


}
