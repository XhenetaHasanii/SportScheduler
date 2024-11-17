package com.example.SportScheduler.dto;

import com.example.SportScheduler.model.Player;
import com.example.SportScheduler.model.Sport;
import com.example.SportScheduler.model.Sporthall;

import java.time.LocalTime;
import java.util.List;

public class AppointmentDTO {

    private Sport sportType;
    private int numberOfPlayers;
    private List<Player> playerList;
    private Sporthall sporthall;
    private LocalTime time;

    public AppointmentDTO(Sport sportType, int numberOfPlayers, List<Player> playerList, Sporthall sporthall, LocalTime time) {
        this.sportType = sportType;
        this.numberOfPlayers = numberOfPlayers;
        this.playerList = playerList;
        this.sporthall = sporthall;
        this.time = time;
    }

    public Sport getSportType() {
        return sportType;
    }

    public void setSportType(Sport sportType) {
        this.sportType = sportType;
    }

    public int getNumberOfPlayers() {
        return numberOfPlayers;
    }

    public void setNumberOfPlayers(int numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
    }

    public List<Player> getPlayerList() {
        return playerList;
    }

    public void setPlayerList(List<Player> playerList) {
        this.playerList = playerList;
    }

    public Sporthall getSporthall() {
        return sporthall;
    }

    public void setSporthall(Sporthall sporthall) {
        this.sporthall = sporthall;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }
}
