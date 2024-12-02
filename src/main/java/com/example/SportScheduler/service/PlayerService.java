package com.example.SportScheduler.service;

import com.example.SportScheduler.dto.PlayerDTO;
import com.example.SportScheduler.model.Player;
import com.example.SportScheduler.repository.PlayerRepository;
import org.springframework.stereotype.Service;

@Service
public class PlayerService {
    private final PlayerRepository playerRepository;

    public PlayerService(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    public Player addNewPlayer(PlayerDTO playerDTO) {
        Player player = new Player();
        player.setName(playerDTO.getName());
        return playerRepository.save(player);
    }

    public Iterable<Player> getAllPlayers() {
        return playerRepository.findAll();
    }
}
