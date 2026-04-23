import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(1, "Bánh quy Danisa", 150000.0, "Đan Mạch", "Hộp thiếc 454g, loại truyền thống"));
        productList.add(new Product(2, "Sữa tươi TH True Milk", 35000.0, "Việt Nam", "Lốc 4 hộp x 180ml, ít đường"));
        productList.add(new Product(3, "Nước ngọt Coca Cola", 10000.0, "Việt Nam", "Lon 320ml"));
        productList.add(new Product(4, "Mì Hảo Hảo", 4000.0, "Việt Nam", "Gói 75g, vị tôm chua cay"));
        productList.add(new Product(5, "Dầu ăn Tường An", 55000.0, "Việt Nam", "Chai nhựa 1 lít, dầu đậu nành"));
        writeDataToFile("product.txt",productList);
        List<Product> productsFormFile = readDataFromFile("product.txt");
        System.out.println(productsFormFile);
//        for (Product product : productsFormFile) {
//            System.out.println(product);
//        }
        for (Product product : productsFormFile) {
            if (product.getId() == 3){
                product.setName("Nước Cam");
                break;
            }
        }
        writeDataToFile("product.txt",productsFormFile);
    }

    public static void writeDataToFile(String path, List<Product> products) {
        try (FileOutputStream fileOutputStream = new FileOutputStream(path);
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
            objectOutputStream.writeObject(products);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @SuppressWarnings("unchecked")
    public static List<Product> readDataFromFile(String path) {
        List<Product> productList = new ArrayList<>();
        try (FileInputStream fileInputStream = new FileInputStream(path);
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
            productList = (List<Product>) objectInputStream.readObject();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return productList;
    }
}
