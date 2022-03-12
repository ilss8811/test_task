package com.example.demo.controller;

import com.example.demo.model.personal_computer.PersonalComputer;
import com.example.demo.model.personal_computer.PersonalComputerType;
import com.example.demo.model.television.Television;
import com.example.demo.model.television.TelevisionType;
import com.example.demo.payload.request.personal_computer.PersonalComputerCreateRequest;
import com.example.demo.payload.request.personal_computer.PersonalComputerSearchRequest;
import com.example.demo.payload.request.personal_computer.PersonalComputerTypeCreateRequest;
import com.example.demo.payload.request.television.TelevisionCreateRequest;
import com.example.demo.payload.request.television.TelevisionSearchRequest;
import com.example.demo.payload.request.television.TelevisionTypeCreateRequest;
import com.example.demo.repository.personal_computer.PersonalComputerRepository;
import com.example.demo.repository.personal_computer.PersonalComputerTypeRepository;
import com.example.demo.repository.television.TelevisionRepository;
import com.example.demo.repository.television.TelevisionTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class PersonalComputerRestController {

    @Autowired
    private PersonalComputerTypeRepository personalComputerTypeRepository;

    @Autowired
    private PersonalComputerRepository personalComputerRepository;

    @PostMapping(path = "/create_personal_computer_type")
    public ResponseEntity<?> createPersonalComputerType(@Valid @RequestBody PersonalComputerTypeCreateRequest request) {
        personalComputerTypeRepository.save(new PersonalComputerType(
                request.getName(),
                request.getCountry(),
                request.getCompany(),
                request.getCredit(),
                request.getOnline()
        ));
        return ResponseEntity.ok("Personal Computer Type created");
    }

    @PostMapping(path = "/create_personal_computer")
    public ResponseEntity<?> createPersonalComputer(@Valid @RequestBody PersonalComputerCreateRequest request) {
        PersonalComputerType type = personalComputerTypeRepository.findById(request.getTypeId())
                .orElseThrow(() -> new RuntimeException("Type is not found"));
        personalComputerRepository.save(new PersonalComputer(
                request.getName(),
                request.getSerialNumber(),
                request.getColor(),
                request.getWidth(),
                request.getLength(),
                request.getHeight(),
                request.getPrice(),
                request.getStock(),
                request.getCategory(),
                request.getProcessor(),
                type
        ));
        return ResponseEntity.ok("Personal Computer created");
    }

    @GetMapping(path = "/search_personal_computer")
    public ResponseEntity<?> searchPersonalComputer(@Valid PersonalComputerSearchRequest request) {
        List<PersonalComputer> personalComputers = new ArrayList<>();
        if(request.getAlphabet_sort() && request.getPrice_sort()) {
            personalComputers = personalComputerRepository.findAllOrderByNameAndPrice(
                    request.getName(),
                    request.getSerialNumber(),
                    request.getColor(),
                    request.getWidth(),
                    request.getLength(),
                    request.getHeight(),
                    request.getPrice_from(),
                    request.getPrice_to(),
                    request.getStock(),
                    request.getCategory(),
                    request.getProcessor(),
                    request.getTypeId()
            );
        } else if(!request.getAlphabet_sort() && request.getPrice_sort()) {
            personalComputers = personalComputerRepository.findAllOrderByPrice(
                    request.getName(),
                    request.getSerialNumber(),
                    request.getColor(),
                    request.getWidth(),
                    request.getLength(),
                    request.getHeight(),
                    request.getPrice_from(),
                    request.getPrice_to(),
                    request.getStock(),
                    request.getCategory(),
                    request.getProcessor(),
                    request.getTypeId()
            );
        } else if(request.getAlphabet_sort() && !request.getPrice_sort()) {
            personalComputers = personalComputerRepository.findAllOrderByName(
                    request.getName(),
                    request.getSerialNumber(),
                    request.getColor(),
                    request.getWidth(),
                    request.getLength(),
                    request.getHeight(),
                    request.getPrice_from(),
                    request.getPrice_to(),
                    request.getStock(),
                    request.getCategory(),
                    request.getProcessor(),
                    request.getTypeId()
            );
        } else {
            personalComputers = personalComputerRepository.findAll(
                    request.getName(),
                    request.getSerialNumber(),
                    request.getColor(),
                    request.getWidth(),
                    request.getLength(),
                    request.getHeight(),
                    request.getPrice_from(),
                    request.getPrice_to(),
                    request.getStock(),
                    request.getCategory(),
                    request.getProcessor(),
                    request.getTypeId()
            );
        }
        return ResponseEntity.ok(personalComputers);
    }
}
