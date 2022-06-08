package view.product;

import controller.ProductController;
import model.Product;
import service.product.ProductService;

import java.util.Scanner;

public class ProductView {
    ProductService productService = new ProductService();
    ProductController productController = new ProductController();
    Scanner scanner = new Scanner(System.in);

    public void creatProduct() {
        int id;
        if (productService.findAll().size() == 0) {
            id = 1;
        } else {
            id = productService.findAll().get(productService.findAll().size() - 1).getId() + 1;
        }
        System.out.println("nhap code: ");
        String code = scanner.nextLine();
        System.out.println("nhap product: ");
        String name = scanner.nextLine();
        System.out.println("Nhap gia: ");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhap SL: ");
        int quantity = Integer.parseInt(scanner.nextLine());
        System.out.println("trang thai: ");
        String status = scanner.nextLine();
        Product product = new Product(id, code, name, price, quantity, status);
        productController.creatProduct(product);
        System.out.println(productController.showlist());

    }

    public void showListProduct() {
        System.out.println(productController.showlist());
    }

    public void editByIdProduct() {
        System.out.println("nhap ID product: ");
        int firstIdEditProduct = Integer.parseInt(scanner.nextLine());
        System.out.println(productController.findById(firstIdEditProduct));
        System.out.println("edit code: ");
        String editCode = scanner.nextLine();
        System.out.println("edit name: ");
        String editName = scanner.nextLine();
        System.out.println("edit price: ");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.println("edit quantity: ");
        int quantity = Integer.parseInt(scanner.nextLine());
        System.out.println("edit status: ");
        String status = scanner.nextLine();
        productController.editFindByIdProduct(firstIdEditProduct, editCode, editName, price, quantity, status);
        System.out.println(" thong tin cap nhat: ");
        System.out.println(productController.showlist());
    }

    public void deleteByIdProduct() {

        System.out.println(productController.showlist());
//            System.out.println("enter to continue delete by id product: ");
        System.out.println("neu ban khong muon xoa thi nhap 0: ");
        System.out.println("nhap Id product muon xoa: ");
        int deleteByIdProduct = scanner.nextInt();
        productController.deleteIdProduct(deleteByIdProduct);

    }
}