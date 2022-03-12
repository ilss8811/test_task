package com.example.demo.controller;

import com.example.demo.model.smart_phone.SmartPhone;
import com.example.demo.model.smart_phone.SmartPhoneType;
import com.example.demo.model.vacuum_cleaner.VacuumCleaner;
import com.example.demo.model.vacuum_cleaner.VacuumCleanerType;
import com.example.demo.payload.request.smart_phone.SmartPhoneCreateRequest;
import com.example.demo.payload.request.smart_phone.SmartPhoneSearchRequest;
import com.example.demo.payload.request.smart_phone.SmartPhoneTypeCreateRequest;
import com.example.demo.payload.request.vacuum_cleaner.VacuumCleanerCreateRequest;
import com.example.demo.payload.request.vacuum_cleaner.VacuumCleanerSearchRequest;
import com.example.demo.payload.request.vacuum_cleaner.VacuumCleanerTypeCreateRequest;
import com.example.demo.repository.smart_phone.SmartPhoneRepository;
import com.example.demo.repository.smart_phone.SmartPhoneTypeRepository;
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
public class SmartPhoneRestController {

    @Autowired
    private SmartPhoneTypeRepository smartPhoneTypeRepository;

    @Autowired
    private SmartPhoneRepository smartPhoneRepository;

    @PostMapping(path = "/create_smart_phone_type")
    public ResponseEntity<?> createSmartPhoneType(@Valid @RequestBody SmartPhoneTypeCreateRequest request) {
        smartPhoneTypeRepository.save(new SmartPhoneType(
                request.getName(),
                request.getCountry(),
                request.getCompany(),
                request.getCredit(),
                request.getOnline()
        ));
        return ResponseEntity.ok("Smart Phone Type created");
    }

    @PostMapping(path = "/create_smart_phone")
    public ResponseEntity<?> createSmartPhone(@Valid @RequestBody SmartPhoneCreateRequest request) {
        SmartPhoneType type = smartPhoneTypeRepository.findById(request.getTypeId())
                .orElseThrow(() -> new RuntimeException("Type is not found"));
        smartPhoneRepository.save(new SmartPhone(
                request.getName(),
                request.getSerialNumber(),
                request.getColor(),
                request.getWidth(),
                request.getLength(),
                request.getHeight(),
                request.getPrice(),
                request.getStock(),
                request.getStorage(),
                request.getCameras(),
                type
        ));
        return ResponseEntity.ok("Smart Phone created");
    }

    @GetMapping(path = "/search_smart_phone")
    public ResponseEntity<?> searchSmartPhone(@Valid SmartPhoneSearchRequest request) {
        List<SmartPhone> smartPhones = new ArrayList<>();
        if(request.getAlphabet_sort() && request.getPrice_sort()) {
            smartPhones = smartPhoneRepository.findAllOrderByNameAndPrice(
                    request.getName(),
                    request.getSerialNumber(),
                    request.getColor(),
                    request.getWidth(),
                    request.getLength(),
                    request.getHeight(),
                    request.getPrice_from(),
                    request.getPrice_to(),
                    request.getStock(),
                    request.getStorage(),
                    request.getCameras(),
                    request.getTypeId()
            );
        } else if(!request.getAlphabet_sort() && request.getPrice_sort()) {
            smartPhones = smartPhoneRepository.findAllOrderByPrice(
                    request.getName(),
                    request.getSerialNumber(),
                    request.getColor(),
                    request.getWidth(),
                    request.getLength(),
                    request.getHeight(),
                    request.getPrice_from(),
                    request.getPrice_to(),
                    request.getStock(),
                    request.getStorage(),
                    request.getCameras(),
                    request.getTypeId()
            );
        } else if(request.getAlphabet_sort() && !request.getPrice_sort()) {
            smartPhones = smartPhoneRepository.findAllOrderByName(
                    request.getName(),
                    request.getSerialNumber(),
                    request.getColor(),
                    request.getWidth(),
                    request.getLength(),
                    request.getHeight(),
                    request.getPrice_from(),
                    request.getPrice_to(),
                    request.getStock(),
                    request.getStorage(),
                    request.getCameras(),
                    request.getTypeId()
            );
        } else {
            smartPhones = smartPhoneRepository.findAll(
                    request.getName(),
                    request.getSerialNumber(),
                    request.getColor(),
                    request.getWidth(),
                    request.getLength(),
                    request.getHeight(),
                    request.getPrice_from(),
                    request.getPrice_to(),
                    request.getStock(),
                    request.getStorage(),
                    request.getCameras(),
                    request.getTypeId()
            );
        }
        return ResponseEntity.ok(smartPhones);
    }

}
