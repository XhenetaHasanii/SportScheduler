package com.example.SportScheduler.dto;

import java.util.List;

public class ScheduleDTO {

    List<AppointmentDTO> appointmentList;

    public ScheduleDTO(List<AppointmentDTO> appointmentList) {
        this.appointmentList = appointmentList;
    }

    public List<AppointmentDTO> getAppointmentList() {
        return appointmentList;
    }

    public void setAppointmentList(List<AppointmentDTO> appointmentList) {
        this.appointmentList = appointmentList;
    }
}
