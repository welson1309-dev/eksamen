package EksamensTræning.fraEK.opgave2;

import java.time.LocalDate;

public class Film {
String filmTitel;
int udgivelsesÅr;
Producer producer;

public void knytProducer(Producer producer){
this.producer = producer;
    }

public Film( String filmTitel, int udgivelsesÅr){
    this.filmTitel=filmTitel;
    this.udgivelsesÅr = udgivelsesÅr;

}

public Film(String filmTitel){
    this.filmTitel = filmTitel;
    this.udgivelsesÅr= LocalDate.now().getYear();
}

    @Override
    public String toString() {
        return "filmtitel"+filmTitel+ "udgivelsesår" + udgivelsesÅr + "Producent" + producer;
    }
}
class Producer{
    String navn;

    public Producer(String navn){
        this.navn=navn;
    }
}
