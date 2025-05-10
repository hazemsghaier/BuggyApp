package com.hazem.BuggyApp.Repository;

import com.hazem.BuggyApp.Entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface RoomRepository extends JpaRepository<Room, Integer> {

}
