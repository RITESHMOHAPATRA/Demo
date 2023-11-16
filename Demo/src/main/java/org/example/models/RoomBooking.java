package org.example.models;

public class RoomBooking {
    String  roomId;
    String buildingId;
    String floorId;

    String userId;

    public void setBuildingId(String buildingId) {
        this.buildingId = buildingId;
    }

    public void setFloorId(String floorId) {
        this.floorId = floorId;
    }

    public void setBookedFrom(int bookedFrom) {
        this.bookedFrom = bookedFrom;
    }

    public void setBookedTill(int bookedTill) {
        this.bookedTill = bookedTill;
    }

    int bookedFrom ;

    public String getRoomId() {
        return roomId;
    }

    public String getBuildingId() {
        return buildingId;
    }

    public String getFloorId() {
        return floorId;
    }

    public String getUserId() {
        return userId;
    }

    public int getBookedFrom() {
        return bookedFrom;
    }

    public int getBookedTill() {
        return bookedTill;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    int bookedTill;

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }
}
