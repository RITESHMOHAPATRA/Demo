package org.example;

import lombok.Getter;
import org.example.dao.Storage;
import org.example.models.Building;
import org.example.models.Room;
import org.example.models.User;
import org.example.service.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Storage s = new Storage();

        //add user
        RegisterUserService registerUserService = new RegisterUserService();
        registerUserService.registerUser("u1",s);

        registerUserService.registerUser("u2",s);

        //check users list
        for(User u : s.getUsers()){
            System.out.println("user id :"+ u.getUserId());
        }

        AddBuildingService addBuildingService = new AddBuildingService();
        s.addBuilding(addBuildingService.addBuilding("b1"));

        //check building list
        for(Building b : s.getBuildingList()){
            System.out.println("buiilding id :"+ b.getId());
        }

        AddFloorService addFloorService = new AddFloorService();
        addFloorService.addFloor("b1","1",s);

        AddConferenceRoomService addConferenceRoomService = new AddConferenceRoomService();
        addConferenceRoomService.addRoom("b1","1",new Room("r1"),s);


        RoomBookingService roomBookingService = new RoomBookingService();
        roomBookingService.bookRoom("u1","1:3","b1","1","r1",s);

        

    }
}
