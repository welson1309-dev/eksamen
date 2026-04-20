package EksamensTræning.chatGPTOpgaver.opg9;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DiceGame {
    private List<Player> players = new ArrayList<>();

    public void addPlayers(Player player){
        players.add(player);
    }

    public void rollDice(){
        Random rand = new Random();

        Player roundWinner = null;
        int highestRoll = 0;

        for (Player player:players) {
            int roll = rand.nextInt(6) + 1;

            if (roll>highestRoll){
                highestRoll=roll;
                roundWinner=player;
            }
        }
        if (roundWinner!=null){
            roundWinner.addPoints();
        }
    }

    public Player whoWon(){
        if (players.isEmpty()){
            return null;
        }
        Player winner = players.get(0);
        for (Player player: players){
            if (player.getPoints()> winner.getPoints()){
                winner=player;
            }
        }
        return winner;
    }
}
