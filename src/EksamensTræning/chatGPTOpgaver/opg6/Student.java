package EksamensTræning.chatGPTOpgaver.opg6;

public class Student {
    private String name;
    private int grade;

    public Student(String name, int grade){
        this.name=name;
        this.grade=grade;
    }

    public String toString(){
        return "navn: "+name+". karakter: "+ grade;
    }
    public int getGrade(){
        return grade;
    }
}
