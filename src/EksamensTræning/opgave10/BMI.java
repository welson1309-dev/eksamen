package EksamensTræning.opgave10;

public class BMI {
    double heightM2;
    double weightKG;
    double bmi;

    public void calculate(){
        bmi = weightKG/heightM2;
    }


public boolean isUnderWeight(){
        return bmi <= 18.5;
}
public boolean isOverWeight(){
        return bmi >= 25;
    }
    public boolean isNormalWeight(){
        return bmi <= 25 && bmi >=18.5;
    }
    public static void main(String[] args) {
        BMI bmi = new BMI();
        bmi.calculate();
        bmi.isUnderWeight();
        bmi.isOverWeight();
        bmi.isNormalWeight();
    }
}
