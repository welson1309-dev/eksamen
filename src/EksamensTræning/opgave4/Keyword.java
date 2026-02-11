package EksamensTræning.opgave4;

import java.util.ArrayList;

public class Keyword {
    private String word, definition;
    private final ArrayList<Keyword> seeAlso = new ArrayList<>();


    public boolean matches(String searchWord){
        return searchWord.equalsIgnoreCase(word);
    }
}
