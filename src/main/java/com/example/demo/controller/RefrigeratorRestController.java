package com.example.demo.controller;

import com.example.demo.model.refrigerator.Refrigerator;
import com.example.demo.model.refrigerator.RefrigeratorType;
import com.example.demo.model.vacuum_cleaner.VacuumCleaner;
import com.example.demo.model.vacuum_cleaner.VacuumCleanerType;
import com.example.demo.payload.request.refrigerator.RefrigeratorCreateRequest;
import com.example.demo.payload.request.refrigerator.RefrigeratorSearchRequest;
import com.example.demo.payload.request.refrigerator.RefrigeratorTypeCreateRequest;
import com.example.demo.payload.request.vacuum_cleaner.VacuumCleanerCreateRequest;
import com.example.demo.payload.request.vacuum_cleaner.VacuumCleanerSearchRequest;
import com.example.demo.payload.request.vacuum_cleaner.VacuumCleanerTypeCreateRequest;
import com.example.demo.repository.refrigerator.RefrigeratorRepository;
import com.example.demo.repository.refrigerator.RefrigeratorTypeRepository;
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
public class RefrigeratorRestController {
    @Autowired
    private RefrigeratorTypeRepository refrigeratorTypeRepository;

    @Autowired
    private RefrigeratorRepository refrigeratorRepository;

    @PostMapping(path = "/create_refrigerator_type")
    public ResponseEntity<?> createRefrigeratorType(@Valid @RequestBody RefrigeratorTypeCreateRequest request) {
        refrigeratorTypeRepository.save(new RefrigeratorType(
                request.getName(),
                request.getCountry(),
                request.getCompany(),
                request.getCredit(),
                request.getOnline()
        ));
        return ResponseEntity.ok("Refrigerator Type created");
    }

    @PostMapping(path = "/create_refrigerator")
    public ResponseEntity<?> createRefrigerator(@Valid @RequestBody RefrigeratorCreateRequest request) {
        RefrigeratorType type = refrigeratorTypeRepository.findById(request.getTypeId())
                .orElseThrow(() -> new RuntimeException("Type is not found"));
        refrigeratorRepository.save(new Refrigerator(
                request.getName(),
                request.getSerialNumber(),
                request.getColor(),
                request.getWidth(),
                request.getLength(),
                request.getHeight(),
                request.getPrice(),
                request.getStock(),
                request.getDoors(),
                request.getCompressor(),
                type
        ));
        return ResponseEntity.ok("Refrigerator created");
    }

    @GetMapping(path = "/search_refrigerator")
    public ResponseEntity<?> searchRefrigerator(@Valid RefrigeratorSearchRequest request) {
        List<Refrigerator> refrigerators = new ArrayList<>();
        if(request.getAlphabet_sort() && request.getPrice_sort()) {
            refrigerators = refrigeratorRepository.findAllOrderByNameAndPrice(
                    request.getName(),
                    request.getSerialNumber(),
                    request.getColor(),
                    request.getWidth(),
                    request.getLength(),
                    request.getHeight(),
                    request.getPrice_from(),
                    request.getPrice_to(),
                    request.getStock(),
                    request.getDoors(),
                    request.getCompressor(),
                    request.getTypeId()
            );
        } else if(!request.getAlphabet_sort() && request.getPrice_sort()) {
            refrigerators = refrigeratorRepository.findAllOrderByPrice(
                    request.getName(),
                    request.getSerialNumber(),
                    request.getColor(),
                    request.getWidth(),
                    request.getLength(),
                    request.getHeight(),
                    request.getPrice_from(),
                    request.getPrice_to(),
                    request.getStock(),
                    request.getDoors(),
                    request.getCompressor(),
                    request.getTypeId()
            );
        } else if(request.getAlphabet_sort() && !request.getPrice_sort()) {
            refrigerators = refrigeratorRepository.findAllOrderByName(
                    request.getName(),
                    request.getSerialNumber(),
                    request.getColor(),
                    request.getWidth(),
                    request.getLength(),
                    request.getHeight(),
                    request.getPrice_from(),
                    request.getPrice_to(),
                    request.getStock(),
                    request.getDoors(),
                    request.getCompressor(),
                    request.getTypeId()
            );
        } else {
            refrigerators = refrigeratorRepository.findAll(
                    request.getName(),
                    request.getSerialNumber(),
                    request.getColor(),
                    request.getWidth(),
                    request.getLength(),
                    request.getHeight(),
                    request.getPrice_from(),
                    request.getPrice_to(),
                    request.getStock(),
                    request.getDoors(),
                    request.getCompressor(),
                    request.getTypeId()
            );
        }
        return ResponseEntity.ok(refrigerators);
    }
}
