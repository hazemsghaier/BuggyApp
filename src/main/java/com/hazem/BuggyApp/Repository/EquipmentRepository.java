package com.hazem.BuggyApp.Repository;

import com.hazem.BuggyApp.Entity.Equipment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EquipmentRepository extends JpaRepository<Equipment, Integer> {
    Optional<Equipment> findByName(String name);
}
