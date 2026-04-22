import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class main {
    static void main(String[] args) {
        String path = "National.csv";
        List<String[]> listString = ReadFile.readFileCSV(path);
        for (String[] strings : listString) {
            System.out.println(Arrays.toString(strings));
        }
    }
}
