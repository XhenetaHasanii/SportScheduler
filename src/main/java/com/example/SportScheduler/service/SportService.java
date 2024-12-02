package com.example.SportScheduler.service;

import com.example.SportScheduler.dto.SportDTO;
import com.example.SportScheduler.model.Sport;
import com.example.SportScheduler.repository.SportRepository;
import org.springframework.stereotype.Service;


@Service
public class SportService {
    private final SportRepository sportRepository;

    public SportService(SportRepository sportRepository) {
        this.sportRepository = sportRepository;
    }

    public Sport addNewSport(SportDTO sportDTO) {
        Sport sport = new Sport();
        sport.setName(sportDTO.getName());
        sport.setNumberOfPlayers(sportDTO.getNumberOfPlayers());
        return sportRepository.save(sport);
    }

    public Iterable<Sport> getAllSports() {
        return sportRepository.findAll();

    }

}
