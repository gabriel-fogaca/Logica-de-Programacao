package entities;

public class Student {
    public String Name;
    public double Grade1;
    public double Grade2;
    public double Grade3;

    public double finalGrade(){
        return (Grade1+Grade2+Grade3);
    }

    public double missGrade(){
        return(60 - finalGrade());
    }

    public String toString(){
        return "NOTA FINAL = " + finalGrade();
    }
}
