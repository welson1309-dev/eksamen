package EksamensTræning.fraEK.opgave11;

import java.util.ArrayList;

public class Article {
    private String heading, body, author;


    public Article(String heading, String body, String author){
        this.heading = heading;
        this.body = body;
        this.author = author;
    }

    public String getLongestWord(){
        String[] words = body.split(" ");
        String longest = " ";

        for(String word : words){
            if(word.length() > longest.length()) {
                longest=word;
            }
        }return longest;
    }

    public ArrayList<String> getWords(){
        String[] words = body.split(" ");
        ArrayList<String>uniqueWords = new ArrayList<>();

        for(String word: words){
            if (!uniqueWords.contains(word)){
                uniqueWords.add(word);
            }
        }
        return uniqueWords;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    public void setHeading(String heading){
        this.heading = heading;
    }
    public void setBody(String body){
        this.body = body;
    }

    public static void main(String[] args) {
        Article art = new Article("Ole som skal i skole",
                "ole bole tog med bus i skole det gør han hver dag",
                "olebole");

        System.out.println("Længste ord = " + art.getLongestWord());
        System.out.println("antal ord = " + art.getWords());
    }
}
