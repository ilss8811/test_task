package com.example.demo.controller;

import com.example.demo.model.television.Television;
import com.example.demo.model.television.TelevisionType;
import com.example.demo.payload.request.television.TelevisionCreateRequest;
import com.example.demo.payload.request.television.TelevisionSearchRequest;
import com.example.demo.payload.request.television.TelevisionTypeCreateRequest;
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
public class TelevisionRestController {

    @Autowired
    private TelevisionTypeRepository televisionTypeRepository;

    @Autowired
    private TelevisionRepository televisionRepository;

    @PostMapping(path = "/create_television_type")
    public ResponseEntity<?> createTelevisionType(@Valid @RequestBody TelevisionTypeCreateRequest request) {
        televisionTypeRepository.save(new TelevisionType(
                request.getName(),
                request.getCountry(),
                request.getCompany(),
                request.getCredit(),
                request.getOnline()
        ));
        return ResponseEntity.ok("Television Type created");
    }

    @PostMapping(path = "/create_television")
    public ResponseEntity<?> createTelevision(@Valid @RequestBody TelevisionCreateRequest request) {
        TelevisionType type = televisionTypeRepository.findById(request.getTypeId())
                .orElseThrow(() -> new RuntimeException("Type is not found"));
        televisionRepository.save(new Television(
                request.getName(),
                request.getSerialNumber(),
                request.getColor(),
                request.getWidth(),
                request.getLength(),
                request.getHeight(),
                request.getPrice(),
                request.getStock(),
                request.getCategory(),
                request.getTechnology(),
                type
        ));
        return ResponseEntity.ok("Television created");
    }

    @GetMapping(path = "/search_television")
    public ResponseEntity<?> searchTelevision(@Valid TelevisionSearchRequest request) {
        List<Television> televisions = new ArrayList<>();
        if(request.getAlphabet_sort() && request.getPrice_sort()) {
            televisions = televisionRepository.findAllOrderByNameAndPrice(
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
                    request.getTechnology(),
                    request.getTypeId()
            );
        } else if(!request.getAlphabet_sort() && request.getPrice_sort()) {
            televisions = televisionRepository.findAllOrderByPrice(
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
                    request.getTechnology(),
                    request.getTypeId()
            );
        } else if(request.getAlphabet_sort() && !request.getPrice_sort()) {
            televisions = televisionRepository.findAllOrderByName(
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
                    request.getTechnology(),
                    request.getTypeId()
            );
        } else {
            televisions = televisionRepository.findAll(
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
                    request.getTechnology(),
                    request.getTypeId()
            );
        }
        return ResponseEntity.ok(televisions);
    }
}
