import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
    public static List<String[]> readFileCSV(String pathFile) {
        List<String[]> list = new ArrayList<>();
        File file = new File(pathFile);
        try {
            if (!file.exists()) {
                throw new FileNotFoundException("File not found");
            }
            try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    String[] newLine = line.split(",");
                    list.add(newLine);
                }
            }
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
