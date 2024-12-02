package com.example.SportScheduler.service;

import com.example.SportScheduler.dto.SporthallDTO;
import com.example.SportScheduler.model.Sporthall;
import com.example.SportScheduler.repository.SporthallRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SporthallService {
    private final SporthallRepository sporthallRepository;
    public SporthallService(SporthallRepository sporthallRepository){
        this.sporthallRepository=sporthallRepository;
    }
    public Sporthall addNewSporthall(SporthallDTO sporthallDTO){
        Sporthall sporthall=new Sporthall();
        sporthall.setName(sporthallDTO.getName());
        return sporthallRepository.save(sporthall);
    }
    public List<Sporthall> getAllSportsHall(){
        return (List<Sporthall>) sporthallRepository.findAll();
    }
}
