package  com.example.SportScheduler.dto;
public class SportDTO {

    private String name;
    private int numberOfPlayers;
    public  SportDTO(String name, int numberOfPlayers){
        this.name=name;
        this.numberOfPlayers=numberOfPlayers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfPlayers() {
        return numberOfPlayers;
    }

    public void setNumberOfPlayers(int numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
    }
}



