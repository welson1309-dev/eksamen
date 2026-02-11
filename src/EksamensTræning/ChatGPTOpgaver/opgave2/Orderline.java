package EksamensTræning.ChatGPTOpgaver.opgave2;

public class Orderline {
    private String name;
    private double price;
    private int quantity;


    public Orderline(String name, double price, int quantity){
        this.name=name;
        this.price=price;
        this.quantity=quantity;
    }

    public double getTotalPrice(){
        return quantity*price;
    }

    @Override
    public String toString() {
        return name+" x "+quantity+ "= "+ getTotalPrice()+"Dkk";
    }
}
