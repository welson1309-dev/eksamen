package EksamensTræning.Opgave6;

public class Bil {
    private int vægt;
    private Trailer trailer;


    public Bil(int vægt){
        this.vægt = vægt;
        this.trailer = null;
    }

    public int totalVægt(){
     if(trailer==null){
         return vægt;
     }return vægt + trailer.getTrailerVægt();
    }
    public boolean kanKobles(){
        if (vægt + trailer.getTrailerVægt()>3500){
            return false;
        } return true;
    }
}
