package com.example.SportScheduler.controller;

import com.example.SportScheduler.dto.SporthallDTO;
import com.example.SportScheduler.model.Sporthall;
import com.example.SportScheduler.service.SporthallService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/sporthall")
@CrossOrigin(origins = "http://localhost:3000")
public class SporthallController {
    private final SporthallService sporthallService;

    SporthallController(SporthallService sporthallRepository) {
        this.sporthallService = sporthallRepository;
    }

    @PostMapping("/addNewLocation")
    public ResponseEntity<Sporthall> addNewSportHall(@RequestBody SporthallDTO sporthallDTO) {
        Sporthall createdSportHall = sporthallService.addNewSporthall(sporthallDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdSportHall);
    }

    @GetMapping("/getAllLocations")
    public Iterable<Sporthall> getAllSportHalls() {
        return sporthallService.getAllSportsHall();
    }
}
