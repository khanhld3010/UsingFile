import java.io.*;
import java.security.AlgorithmConstraints;

public class ReadFileExample {
    public void readFileText(String filePath){
        try {
            File file = new File(filePath);
            if (!file.exists()){
                throw new FileNotFoundException();
            }
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            int sum = 0;
            while ((line = br.readLine()) != null){
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            br.close();
            System.out.println("Tổng = "+sum);
        }catch (FileNotFoundException e){
            System.err.println("File không tồn tại hoặc nội dung có lỗi!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (NumberFormatException e ){
            System.out.println("Trong file có dữ liệu không phải số nguyên");
        }
    }

}
