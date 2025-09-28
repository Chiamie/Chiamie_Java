import java.util.ArrayList;

public class Person {
    private ArrayList<Problems> problems;

    public Person() {
        this.problems = new ArrayList<>();
    }

    public ArrayList<Problems> getProblems() {
        return problems;
    }

    public void addProblem(Problems p) {
        this.problems.add(p);
    }

}
