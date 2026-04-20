package EksamensTræning.chatGPTOpgaver.opg3;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FitCenter {
    List<Membership> members = new ArrayList<>();

    public void addMembership(Membership membership){
        members.add(membership);
    }

    public double getTotalRevenue(){
        double totalRevenue=0;

        for (Membership membership: members){
            totalRevenue+= membership.getTotalrev();

        }return totalRevenue;
    }

    public void memberToFile() throws IOException {
        FileWriter fw = new FileWriter("src/EksamensTræning/ChatGPTOpgaver/opgave2/Members.csv");
        for (Membership membership: members){

            fw.write(membership.toString()+"\n");
        }fw.close();
    }

    public void fileToGUI(){
        try{
            Scanner scn = new Scanner(new FileReader("src/EksamensTræning/ChatGPTOpgaver/opgave2/Members.csv"));
            while (scn.hasNextLine()){
                String line = scn.nextLine();
                System.out.println(line);

            }
            scn.close();
        }catch (FileNotFoundException e){
            System.out.println("fil ikke fundet");
        }
    }

    public static void main(String[] args) throws Exception {
        FitCenter fitCenter = new FitCenter();
        fitCenter.addMembership(new Membership("anni",400.0,1));
        fitCenter.addMembership(new Membership("ole",450.0,4));
        fitCenter.memberToFile();
        System.out.println(fitCenter.getTotalRevenue());
        fitCenter.fileToGUI();
    }
}
