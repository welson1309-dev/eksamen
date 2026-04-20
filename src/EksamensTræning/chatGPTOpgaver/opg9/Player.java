package EksamensTræning.chatGPTOpgaver.opg9;

public class Player {
    private String name;
    private int points;

    public Player(String name, int points){
        this.name=name;
        this.points=points;
    }

    public int getPoints(){
        return points;
    }

    public void addPoints(){
        points++;
    }

    public String toString(){
        return name+","+points;
    }
}
