package controller;

import model.Product;
import service.product.ProductService;

import java.util.List;


public class ProductController {
    ProductService productService = new ProductService();

    public void creatProduct(Product product) {
        productService.save(product);
        productService.findAll();
    }

    public List<Product> showlist() {
        return productService.findAll();
    }

    public Product findById(int id){
        return productService.findByIdProduct(id);
    }

    public void editFindByIdProduct(int id, String code,String name,double price,int quantity,String status){
        Product product = productService.findByIdProduct(id);
        product.setCode(code);
        product.setName(name);
        product.setPrice(price);
        product.setQuantity(quantity);
        product.setStatus(status);
        productService.findAll();
    }

    public Product deleteIdProduct(int id){
        return productService.deleteById(id);
    }

}
