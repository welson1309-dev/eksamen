package EksamensTræning.chatGPTOpgaver.opg7;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Account> accounts = new ArrayList<>();


    public void addAccount(Account account){
        accounts.add(account);
    }
    public double getTotalBalance(){
        if (accounts.isEmpty()){
            return 0;
        }
        double total=0;
        for (Account account: accounts){
            total+=account.getBalance();
        }
        return total;
    }

    public Account getRichest(){
        if (accounts.isEmpty()){
            return null;
        }
        Account richestAccount = accounts.get(0);
        for (Account account: accounts){
            if (account.getBalance()>richestAccount.getBalance()){
                richestAccount=account;
            }
        }
        return richestAccount;
    }

    public void writeToFIle()throws IOException {
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(
                "src/EksamensTræning/ChatGPTOpgaver/opg7/bankfile.csv"))){


            for (Account account: accounts){
                bw.write(account.toString());
                bw.newLine();
            }

        }
    }

    public void loadFraFil() {
        try (BufferedReader br = new BufferedReader(new FileReader(
                "src/EksamensTræning/ChatGPTOpgaver/opg7/bankfile.csv"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");

                String name = parts[0];
                double balance = Double.parseDouble(parts[1]);

                Account account = new Account(name, balance);
                accounts.add(account);
            }
        } catch (IOException e) {
            System.out.println("fil ikke fundet");
        }
    }

}
