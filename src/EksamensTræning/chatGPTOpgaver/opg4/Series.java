package EksamensTræning.chatGPTOpgaver.opg4;

import java.util.ArrayList;
import java.util.List;

public class Series {
    private String title;
    List<Episode> episodes;


    public Series(String title){
        this.title=title;
        episodes= new ArrayList<>();
    }

    public void addEpisodes(Episode episode){
        episodes.add(episode);
    }

    public int getTotalSeriesDuration(){
        int total=0;
        for (Episode episode:episodes){
            total+=episode.getDuration();
        } return total;
    }

  public Episode getLongestEpisode(){
            if (episodes.isEmpty()){
                return null;
            }
            Episode longest = episodes.get(0);

      for (Episode episode : episodes){
          if (episode.getDuration()> longest.getDuration()){
              longest = episode;
          }
      }
      return longest;
  }


    public static void main(String[] args) {
        Series series = new Series("a");
        Episode e1 = new Episode("e1",64);
        Episode e2 = new Episode("e2",67);
        Episode e3 = new Episode("e3",62);
        series.addEpisodes(e1);
        series.addEpisodes(e2);
        series.addEpisodes(e3);
        series.getLongestEpisode();
        series.getTotalSeriesDuration();
        System.out.println(series.getTotalSeriesDuration());
        System.out.println(series.getLongestEpisode());

    }
}
