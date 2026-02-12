package EksamensTræning.opgave4;

import java.util.ArrayList;

public class Keyword {
    private String word, definition;
    private final ArrayList<Keyword> seeAlso = new ArrayList<>();


    public Keyword(String word, String definition){
        this.word=word;
        this.definition=definition;
    }

    public void addKeyword(Keyword keyword){
        seeAlso.add(keyword);
    }


    public boolean matches(String searchWord){
        return searchWord.equalsIgnoreCase(word);
    }

    public ArrayList<Keyword> showSeeAlso(){
        return seeAlso;
    }

    @Override
    public String toString(){
        return word +" and "+ definition;
    }

    public static void main(String[] args) {
        Keyword keyword = new Keyword("asd","asd");
        Keyword relatedKey = new Keyword("ads","add");
        keyword.addKeyword(relatedKey);
        System.out.println(keyword.showSeeAlso());
    }
}
