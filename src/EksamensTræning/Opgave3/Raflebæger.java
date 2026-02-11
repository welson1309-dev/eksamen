package EksamensTræning.Opgave3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Raflebæger {
    private final List<Integer> øjne;
    private final int antalTerninger;
    private final Random rand = new Random();


    public Raflebæger(int antalTerninger){
        this.antalTerninger = antalTerninger;
        this.øjne = new ArrayList<>();
    }

    public int ryst(){
        int terning=0;
        int sum=0;
        øjne.clear();
        for(int i = 0; i<antalTerninger; i++){
            terning = rand.nextInt(6)+1;
            øjne.add(terning);
            sum += terning;
        }
        return sum;
    }

    public List<Integer> se(){
        return List.copyOf(øjne);
    }
}
