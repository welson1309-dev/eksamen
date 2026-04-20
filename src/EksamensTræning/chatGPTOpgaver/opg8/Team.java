package EksamensTræning.chatGPTOpgaver.opg8;

import java.util.ArrayList;

public class Team {
    ArrayList<Player> players = new ArrayList<>();

    public void addPlayer(Player player){
        players.add(player);
    }

    public int getTotalScore(){
        if (players.isEmpty()){
            return 0;
        }
        int totalScore=0;
        for (Player player: players){
            totalScore+=player.getScore();
        }
        return totalScore;
    }

    public Player getBestPlayer(){
        if (players.isEmpty()){
            return null;
        }
        Player bestPlayer = players.get(0);
        for (Player player: players){
            if (player.getScore()> bestPlayer.getScore()){
                bestPlayer=player;
            }
        }
        return bestPlayer;
    }

    public double getAverage(){
        if (players.isEmpty()){
            return 0;
        }
        int sum =0;
        for (Player player: players){
            sum+=player.getScore();

        }
        return (double)sum/players.size();
    }
}
