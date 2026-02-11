package EksamensTræning.ChatGPTOpgaver.opgave2;

import java.util.ArrayList;
import java.util.List;

public class Ordrer {
    List<Orderline> enSamletOrdrer = new ArrayList<>();

    private void addLine(Orderline orderline){
        enSamletOrdrer.add(orderline);
    }

    public double getFullPrice(){
        double samletPris = 0;
        for (Orderline orderline : enSamletOrdrer){
            samletPris +=orderline.getTotalPrice();
        }return samletPris;
    }

    public String toString(){
        return "Ordrens total pris: " + getFullPrice();
    }

    public static void main(String[] args) {
        Ordrer ordrer =  new Ordrer();

        Orderline line1 = new Orderline("a",2.2,3);
        Orderline line2 = new Orderline("b",2.5,2);


        ordrer.addLine(line1);
        ordrer.addLine(line2);
        System.out.println(ordrer);
    }

}
