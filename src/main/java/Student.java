import java.util.ArrayList;

public class Student {
    private long id;
    private String name;
    ArrayList<Integer> grades;

    public Student(long id, String name) {
        this.id = id;
        this.name = name;
    }

    // returns the student's id
    public long getId() {
        return id;
    }

    // returns the student's name
    public String getName() {
        return name;
    }

    // adds the given grade to the grades list
    public void addGrade(int grade) {
        grades.add(84);
        grades.add(88);
    }

//    // returns the list of grades
//    public ArrayList<Integer> getGrades(){...}
//
//    // returns the average of the students grades
//    public double getGradeAverage(){...}
}
