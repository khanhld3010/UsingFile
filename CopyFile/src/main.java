public class main {
    static void main(String[] args) {
        System.out.println("Hello World!");
        CopyFile copyFile = new CopyFile();
        String sourceFile = "SourceFile.txt";
        copyFile.copyFile(sourceFile,"DestinationFile3.txt");
    }
}
