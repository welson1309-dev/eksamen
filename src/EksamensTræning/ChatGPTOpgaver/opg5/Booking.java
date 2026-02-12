package EksamensTræning.ChatGPTOpgaver.opg5;

public class Booking {
    private String guestName;
    private int nights;
    private double pricePerNight;

    public Booking(String guestName,int nights, double pricePerNight){
        this.guestName=guestName;
        this.nights=nights;
        this.pricePerNight=pricePerNight;
    }
    public double getTotalPrice(){
        return nights*pricePerNight;
    }

    public String toString(){
        return guestName+","+nights+","+pricePerNight;
    }
    public int getNights(){
        return nights;
    }
}
