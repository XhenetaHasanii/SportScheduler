package com.example.SportScheduler.controller;

import com.example.SportScheduler.dto.PlayerDTO;
import com.example.SportScheduler.model.Player;
import com.example.SportScheduler.service.PlayerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/player")
@CrossOrigin(origins = "http://localhost:3000")
public class PlayerController {
    private final PlayerService playerService;
    public PlayerController(PlayerService playerService){
        this.playerService=playerService;
    }
    @PostMapping("/addNewPlayer")
    public ResponseEntity<Player> addNewPlayer(@RequestBody PlayerDTO playerDTO){
        Player createdPlayer= playerService.addNewPlayer(playerDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdPlayer);
    }
    @GetMapping("/getAllPlayers")
    public Iterable<Player> getAllPlayers(){
        return playerService.getAllPlayers();
    }

}
