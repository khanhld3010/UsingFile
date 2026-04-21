import java.util.List;

public class main {
    static void main(String[] args) {
        System.out.println("Thư mục làm việc hiện tại: " + System.getProperty("user.dir"));
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<Integer> numbers = readAndWriteFile.readFile("numbers.txt");
        int maxValue = readAndWriteFile.findMax(numbers);
        readAndWriteFile.writeFile("result.txt", maxValue);
        System.out.println("Danh sách các số nguyên: " + numbers);
        System.out.println("Giá trị lớn nhất trong danh sách là: " + maxValue);

    }
}
