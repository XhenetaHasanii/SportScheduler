package com.example.SportScheduler.service;

import com.example.SportScheduler.dto.ScheduleDTO;
import com.example.SportScheduler.model.Schedule;
import com.example.SportScheduler.repository.ScheduleRepository;
import org.springframework.stereotype.Service;

@Service
public class ScheduleService {
    private final ScheduleRepository scheduleRepository;

    public ScheduleService(ScheduleRepository scheduleRepository) {
        this.scheduleRepository = scheduleRepository;
    }

    public Schedule addNewSchedule(ScheduleDTO scheduleDTO) {
        Schedule schedule = new Schedule();
        schedule.setAppointmentList(schedule.getAppointmentList());
        return scheduleRepository.save(schedule);
    }

    public Schedule getAllSchedules(ScheduleDTO scheduleDTO) {
        Schedule createdSchedule = new Schedule();
        createdSchedule.setAppointmentList(scheduleDTO.getAppointmentList());
        return scheduleRepository.save(createdSchedule);
    }
}