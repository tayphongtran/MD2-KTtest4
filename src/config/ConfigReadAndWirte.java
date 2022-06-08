package config;



import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ConfigReadAndWirte<T> {
    public static String PATH = "D:\\workspace\\Java\\MD2-KT-Product\\src\\data\\";

    public List<T> readFormFile(String path){
        List<T> products = new ArrayList<>();
        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            products = (List<T>) objectInputStream.readObject();
            objectInputStream.close();

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return  products;
    }
    public void writeToFile(String path, List<T> products){
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(path);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(products);
            objectOutputStream.close();
            fileOutputStream.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
