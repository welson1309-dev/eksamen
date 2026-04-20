package EksamensTræning.fraEK.opgave2;

import java.time.LocalDate;

public class Film2 {
    private final String filmtitel;
    private final int udgivelsesÅr;
    private Producer2 p;

    public void knytProducer2(Producer2 p){
        this.p = p;

    }

    public Film2(String filmtitel, int udgivelsesÅr){
        this.filmtitel = filmtitel;
        this.udgivelsesÅr = udgivelsesÅr;

    }

    public Film2(String filmtitel){
        this.filmtitel = filmtitel;
        this.udgivelsesÅr = LocalDate.now().getYear();
    }
}

