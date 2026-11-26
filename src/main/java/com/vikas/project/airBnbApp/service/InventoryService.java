package com.vikas.project.airBnbApp.service;


import com.vikas.project.airBnbApp.entity.Room;

public interface InventoryService {

    void initializeRoomForAYear(Room room);

    void deleteFutureInventories(Room room);

}
