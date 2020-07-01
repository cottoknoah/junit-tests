import java.util.ArrayList;

public class Student {
    private String name;
    private long Id;
    private ArrayList<Integer> grades;

    public Student(String name, long id) {
        this.name = name;
        this.Id = id;
        this.grades = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public long getId() {
        return this.Id;
    }

    public void addGrade(int grade) {
        this.grades.add(grade);
    }

    public double getGradeAverage() {
        int counter = 0;
        int total = 0;
        for (Integer grade : this.grades) {
            total += grade;
            counter++;
        }
        return (double) total / counter;
    }
}
