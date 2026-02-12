package EksamensTræning.ChatGPTOpgaver.opg4;

public class Episode {
    private String title;
    private int durationMinutes;


    public Episode(String title, int durationMinutes){
        this.title=title;
        this.durationMinutes=durationMinutes;

    }

    public String toString(){
        return title + " ("+durationMinutes+") minuttes.";
    }

    public int getDuration(){
        return durationMinutes;
    }

}
