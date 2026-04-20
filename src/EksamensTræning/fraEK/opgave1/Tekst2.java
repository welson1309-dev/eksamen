package EksamensTræning.fraEK.opgave1;

import java.util.ArrayList;

public class Tekst2 {
    private final ArrayList<String> tekstLinjer = new ArrayList<>();


    private void tilføj(String tekst){
        tekstLinjer.add(tekst);
    }

    public int findAntalUnikke(){
         ArrayList<String> unikke = new ArrayList<>();
        for (String s : tekstLinjer){
            if (!unikke.contains(s)){
                unikke.add(s);
            }
        }return unikke.size();
    }
}
