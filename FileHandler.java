import java.io.*;

public class FileHandler {

    public static void save(String data) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("plan.txt"))) {
            bw.write(data);
        } catch (IOException e) {
            System.out.println("Error saving file");
        }
    }
}
