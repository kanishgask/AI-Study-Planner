import java.util.*;

public class AIEngine {

    public static List<Task> prioritize(List<Task> tasks) {
        tasks.sort((a, b) -> score(b) - score(a));
        return tasks;
    }

    private static int score(Task t) {
        // AI-like scoring logic
        return (t.difficulty * 2) + (10 - t.daysLeft);
    }
}
