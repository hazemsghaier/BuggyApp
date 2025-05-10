package com.hazem.BuggyApp.Repository;

import com.hazem.BuggyApp.Entity.Booking;
import com.hazem.BuggyApp.Entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import javax.crypto.spec.OAEPParameterSpec;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public interface BookingRepository extends JpaRepository<Booking, Integer>{

}
