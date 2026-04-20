package EksamensTræning.fraEK.opgave5;

public class Card {
    private final String suit;
    private final int value;

    public Card(String suit, int value){
        this.suit = suit;
        this.value = value;
    }



    public boolean beats(Card andetCard){
        if(this.value>andetCard.value) {
            return true;}
        if(this.value<andetCard.value){
            return false;
        }
        return this.suitRank()>andetCard.suitRank();

    }

    public int suitRank(){
        if(suit.equalsIgnoreCase("hearts")) return 4;
        if(suit.equalsIgnoreCase("diamonds")) return 3;
        if(suit.equalsIgnoreCase("clubs")) return 2;
        if (suit.equalsIgnoreCase("spades")) return 1;
        return 0;
    }
    public String toString(){
        return suit+","+value;
    }
}
