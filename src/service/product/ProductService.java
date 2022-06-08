package service.product;

import config.ConfigReadAndWirte;
import model.Product;

import java.util.List;

public class ProductService implements IProductService {
    public static String PATH_PRODUCT = ConfigReadAndWirte.PATH + "product.txt";
    public static List<Product> products = new ConfigReadAndWirte<Product>().readFormFile(PATH_PRODUCT);
    @Override
    public List<Product> findAll() {
        new ConfigReadAndWirte<Product>().writeToFile(PATH_PRODUCT,products);
        return products;
    }

    @Override
    public void save(Product product) {
    products.add(product);
    }

    @Override
    public Product findByIdProduct(int id) {
        for (int i = 0; i < products.size(); i++) {
            if (id==products.get(i).getId()){
                return products.get(i);
            }
        }
        return null;
    }

    @Override
    public Product deleteById(int id) {
        for (int i = 0; i < products.size(); i++) {
            if (id == products.get(i).getId()){
                products.remove(products.get(i));
            }
        }
        return null;
    }
}
