package com.hazem.BuggyApp.Repository;

import com.hazem.BuggyApp.Entity.Equipment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository

public interface EquipmentRepository extends JpaRepository<Equipment, Integer> {
}
