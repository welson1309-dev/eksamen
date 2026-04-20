package EksamensTræning.chatGPTOpgaver.opg7;

public class Account {
    private String owner;
    private double balance;


    public Account(String owner, double balance){
        this.owner=owner;
        this.balance=balance;
    }

    public double getBalance(){
        return balance;
    }
    public String toString(){
        return owner+","+balance;
    }
}
