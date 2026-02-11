package EksamensTræning.ChatGPTOpgaver.opg3;

public class Membership {
    private String memberName;
    private double monthlyPrice;
    private int months;

    public Membership(String memberName, double monthlyPrice, int months){
        this.memberName=memberName;
        this.monthlyPrice=monthlyPrice;
        this.months=months;
    }

    public String toString(){
        return memberName +","+monthlyPrice+","+months;
    }

    public double getTotalrev(){
        return monthlyPrice*months;
    }
}
