import java.io.*;

public class CopyFile {
    public void copyFile(String filePathSource, String filePathDestination) {
        File sourceFile = new File(filePathSource);
        File destinationFile = new File(filePathDestination);
        try {
            try (BufferedReader bufferedReader = new BufferedReader(new FileReader(sourceFile));
                 BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(destinationFile));) {
                if (!sourceFile.exists()) {
                    throw new FileNotFoundException();
                }
                if (destinationFile.exists()) {
                    throw new IOException();
                }
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    bufferedWriter.write(line);
                    bufferedWriter.newLine();
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
