package com.example.SportScheduler.controller;

import com.example.SportScheduler.dto.ScheduleDTO;
import com.example.SportScheduler.model.Schedule;
import com.example.SportScheduler.service.ScheduleService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.function.EntityResponse;

@RestController
@RequestMapping("api/schedule")
@CrossOrigin(origins = "http://localhost:3000")
public class ScheduleController {
    private final ScheduleService scheduleService;
    public ScheduleController(ScheduleService scheduleService){
        this.scheduleService=scheduleService;
    }

    @PostMapping("/addNewSchedule")
    public ResponseEntity<Schedule> addNewSchedule(@RequestBody ScheduleDTO scheduleDTO){

        Schedule createdSchedule=scheduleService.addNewSchedule(scheduleDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdSchedule);
    }

}
