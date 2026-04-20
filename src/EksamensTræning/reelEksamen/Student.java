package EksamensTræning.reelEksamen;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Grade> karaktere = new ArrayList<>();

    public void addGrade(Grade grade){
        karaktere.add(grade);
    }
    public Student(String name){
        this.name=name;
    }

    public void diplom(){
        int gennemsnit=0;
        if (karaktere.isEmpty()){
            System.out.println("ingen karakter her");
        }

        int sum=0;
        for (Grade grade: karaktere){
            sum+=grade.getGrade();


        }
        gennemsnit=sum/karaktere.size();
        System.out.println("Studentens navn: "+ name + ". Studentensgennemsnit: " + gennemsnit);
        if (gennemsnit<2){
            System.out.println("not passed");
        }
        if (gennemsnit>2 && gennemsnit<7){
            System.out.println("Passed");
        }
        if (gennemsnit>7){
            System.out.println("very good!");
        }

    }

    public static void main(String[] args) {
        Student student = new Student("ole");
        Grade grade = new Grade(2);
        student.addGrade(grade);
        student.diplom();

    }

}
