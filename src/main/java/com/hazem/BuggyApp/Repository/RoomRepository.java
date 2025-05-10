package com.hazem.BuggyApp.Repository;

import com.hazem.BuggyApp.Entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoomRepository extends JpaRepository<Room, Integer> {
    Optional<Room> findByRoomNumber(String roomNumber);
    Optional<Room> findByRoomName(String roomName);
}
