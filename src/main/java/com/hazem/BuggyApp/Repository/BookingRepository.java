package com.hazem.BuggyApp.Repository;

import com.hazem.BuggyApp.Entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BookingRepository extends JpaRepository<Booking, Integer>{

}
