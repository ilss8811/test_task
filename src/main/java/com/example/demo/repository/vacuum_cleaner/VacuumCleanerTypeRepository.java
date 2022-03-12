package com.example.demo.repository.vacuum_cleaner;

import com.example.demo.model.vacuum_cleaner.VacuumCleanerType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VacuumCleanerTypeRepository extends JpaRepository<VacuumCleanerType, Integer> {
}
