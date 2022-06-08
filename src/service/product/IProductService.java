package service.product;

import model.Product;
import service.IServiceGeneric;

public interface IProductService extends IServiceGeneric<Product> {
    Product findByIdProduct(int id);
    Product deleteById(int id);
}
