package com.vikas.project.airBnbApp.repository;

import com.vikas.project.airBnbApp.entity.Inventory;
import com.vikas.project.airBnbApp.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;

public interface InventoryRepository extends JpaRepository<Inventory, Long> {

    void deleteByDateAfterAndRoom(LocalDate date, Room room);
}
