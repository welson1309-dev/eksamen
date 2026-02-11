package EksamensTræning.opgave15;

import java.util.ArrayList;
import java.util.List;

public class ExamQuestion {
    int number;
    char grade;

    public ExamQuestion(int number, char grade){
        this.grade=grade;
        this.number=number;
    }

    public void randomGrade(){
        char[] gradess = {'A','B','C','D','E','F'};

        List<Character> grades = new ArrayList<>();
        grades.add('A');
        grades.add('B');
        grades.add('C');
        grades.add('D');
        grades.add('E');
        grades.add('F');

        int index =(int)(Math.random()*grades.size());
        grade=grades.get(index);


    }
}
