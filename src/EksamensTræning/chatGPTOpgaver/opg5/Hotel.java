package EksamensTræning.chatGPTOpgaver.opg5;

import java.io.*;
import java.util.ArrayList;

public class Hotel {
    ArrayList<Booking> bookings = new ArrayList<>();

    public double getTotalRevenue(){
        double totalRevenue=0;
        for (Booking booking: bookings){
            totalRevenue+=booking.getTotalPrice();
        }
        return totalRevenue;
    }

    public void addBooking(Booking booking){
        bookings.add(booking);
    }
    public Booking getLongestStay(){
        if (bookings.isEmpty()){
            return null;
        }
        Booking longestStay = bookings.get(0);
        for (Booking booking: bookings){
            if (booking.getNights()>longestStay.getNights()){
                longestStay=booking;
            }
        }
        return longestStay;
    }

    public void bookingWriteToFile() throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(
                "src/EksamensTræning/ChatGPTOpgaver/opg5/Bookings.csv"))) {


            for (Booking booking : bookings) {
                bw.write(booking.toString());
                bw.newLine();

            }
        }
    }

    public void loadBookingFromFile(){
    try (BufferedReader br = new BufferedReader(new FileReader("src/EksamensTræning/ChatGPTOpgaver/opg5/Bookings.csv"))){
        String line;
        while((line = br.readLine()) !=null){
            String[] parts = line.split(",");

            String name = parts[0];
            int nights = Integer.parseInt(parts[1]);
            double pricePerNight = Double.parseDouble(parts[2]);

            Booking booking = new Booking(name,nights,pricePerNight);
            bookings.add(booking);
        }

    }catch (IOException e){
        System.out.println("fil ikke fundet");
    }
    }
}
