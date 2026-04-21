import java.util.Scanner;

public class main {
    static void main(String[] args) {
        ReadFileExample readFileExample = new ReadFileExample();
        System.out.println("Nhập đường dẫn file: ");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        readFileExample.readFileText(path);
    }
}
