package com.example.demo.repository.personal_computer;

import com.example.demo.model.personal_computer.PersonalComputerType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonalComputerTypeRepository extends JpaRepository<PersonalComputerType, Integer> {
}
