package com.example.SportScheduler.controller;

import com.example.SportScheduler.dto.SportDTO;
import com.example.SportScheduler.model.Sport;
import com.example.SportScheduler.service.SportService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/sport")
@CrossOrigin(origins = "http://localhost:3000")
public class SportController {
    private final SportService sportService;

    SportController(SportService sportService) {
        this.sportService = sportService;
    }

    @PostMapping("/addNewSport")
    public ResponseEntity<Sport> addNewSport(@RequestBody SportDTO sportDTO) {
        Sport createdSport = sportService.addNewSport(sportDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdSport);
    }

    @GetMapping("/getAllSports")
    public Iterable<Sport> getAllSports() {
        return sportService.getAllSports();
    }


}
