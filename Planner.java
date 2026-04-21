import java.util.*;

public class Planner {
    private List<Task> tasks = new ArrayList<>();

    public void addTask(String name, int difficulty, int daysLeft) {
        tasks.add(new Task(name, difficulty, daysLeft));
    }

    public void generatePlan() {
        List<Task> sorted = AIEngine.prioritize(tasks);

        System.out.println("\n📅 Study Plan:");
        int day = 1;
        for (Task t : sorted) {
            System.out.println("Day " + day++ + ": " + t.name);
        }
    }
}
