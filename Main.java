import java.util.*;

public class Main {
    public static void main(String[] args) {
        Planner planner = new Planner();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add Subject\n2. Generate Plan\n3. Exit");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Subject: ");
                    String name = sc.nextLine();

                    System.out.print("Difficulty (1-5): ");
                    int difficulty = sc.nextInt();

                    System.out.print("Days left: ");
                    int days = sc.nextInt();

                    planner.addTask(name, difficulty, days);
                    break;

                case 2:
                    planner.generatePlan();
                    break;

                case 3:
                    System.exit(0);
            }
        }
    }
}
