package com.example.demo.controller;

import com.example.demo.model.television.Television;
import com.example.demo.model.television.TelevisionType;
import com.example.demo.model.vacuum_cleaner.VacuumCleaner;
import com.example.demo.model.vacuum_cleaner.VacuumCleanerType;
import com.example.demo.payload.request.television.TelevisionCreateRequest;
import com.example.demo.payload.request.television.TelevisionSearchRequest;
import com.example.demo.payload.request.television.TelevisionTypeCreateRequest;
import com.example.demo.payload.request.vacuum_cleaner.VacuumCleanerCreateRequest;
import com.example.demo.payload.request.vacuum_cleaner.VacuumCleanerSearchRequest;
import com.example.demo.payload.request.vacuum_cleaner.VacuumCleanerTypeCreateRequest;
import com.example.demo.repository.vacuum_cleaner.VacuumCleanerRepository;
import com.example.demo.repository.vacuum_cleaner.VacuumCleanerTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class VacuumCleanerRestController {

    @Autowired
    private VacuumCleanerTypeRepository vacuumCleanerTypeRepository;

    @Autowired
    private VacuumCleanerRepository vacuumCleanerRepository;

    @PostMapping(path = "/create_vacuum_cleaner_type")
    public ResponseEntity<?> createVacuumCleanerType(@Valid @RequestBody VacuumCleanerTypeCreateRequest request) {
        vacuumCleanerTypeRepository.save(new VacuumCleanerType(
                request.getName(),
                request.getCountry(),
                request.getCompany(),
                request.getCredit(),
                request.getOnline()
        ));
        return ResponseEntity.ok("Vacuum Cleaner Type created");
    }

    @PostMapping(path = "/create_vacuum_cleaner")
    public ResponseEntity<?> createVacuumCleaner(@Valid @RequestBody VacuumCleanerCreateRequest request) {
        VacuumCleanerType type = vacuumCleanerTypeRepository.findById(request.getTypeId())
                .orElseThrow(() -> new RuntimeException("Type is not found"));
        vacuumCleanerRepository.save(new VacuumCleaner(
                request.getName(),
                request.getSerialNumber(),
                request.getColor(),
                request.getWidth(),
                request.getLength(),
                request.getHeight(),
                request.getPrice(),
                request.getStock(),
                request.getMods(),
                request.getVolume(),
                type
        ));
        return ResponseEntity.ok("Vacuum Cleaner created");
    }

    @GetMapping(path = "/search_vacuum_cleaner")
    public ResponseEntity<?> searchVacuumCleaner(@Valid VacuumCleanerSearchRequest request) {
        List<VacuumCleaner> vacuumCleaners = new ArrayList<>();
        if(request.getAlphabet_sort() && request.getPrice_sort()) {
            vacuumCleaners = vacuumCleanerRepository.findAllOrderByNameAndPrice(
                    request.getName(),
                    request.getSerialNumber(),
                    request.getColor(),
                    request.getWidth(),
                    request.getLength(),
                    request.getHeight(),
                    request.getPrice_from(),
                    request.getPrice_to(),
                    request.getStock(),
                    request.getMods(),
                    request.getVolume(),
                    request.getTypeId()
            );
        } else if(!request.getAlphabet_sort() && request.getPrice_sort()) {
            vacuumCleaners = vacuumCleanerRepository.findAllOrderByPrice(
                    request.getName(),
                    request.getSerialNumber(),
                    request.getColor(),
                    request.getWidth(),
                    request.getLength(),
                    request.getHeight(),
                    request.getPrice_from(),
                    request.getPrice_to(),
                    request.getStock(),
                    request.getMods(),
                    request.getVolume(),
                    request.getTypeId()
            );
        } else if(request.getAlphabet_sort() && !request.getPrice_sort()) {
            vacuumCleaners = vacuumCleanerRepository.findAllOrderByName(
                    request.getName(),
                    request.getSerialNumber(),
                    request.getColor(),
                    request.getWidth(),
                    request.getLength(),
                    request.getHeight(),
                    request.getPrice_from(),
                    request.getPrice_to(),
                    request.getStock(),
                    request.getMods(),
                    request.getVolume(),
                    request.getTypeId()
            );
        } else {
            vacuumCleaners = vacuumCleanerRepository.findAll(
                    request.getName(),
                    request.getSerialNumber(),
                    request.getColor(),
                    request.getWidth(),
                    request.getLength(),
                    request.getHeight(),
                    request.getPrice_from(),
                    request.getPrice_to(),
                    request.getStock(),
                    request.getMods(),
                    request.getVolume(),
                    request.getTypeId()
            );
        }
        return ResponseEntity.ok(vacuumCleaners);
    }
}
