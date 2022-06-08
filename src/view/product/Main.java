package view.product;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu: ");
            System.out.println("1:Xem list");
            System.out.println("2:Them moi");
            System.out.println("3:Cap nhat");
            System.out.println("4:Xoa");
            int chose = scanner.nextInt();
            switch (chose) {
                case 1:
                    new ProductView().showListProduct();

                    break;
                case 2:
                    new ProductView().creatProduct();
                    break;
                case 3:
                    new ProductView().editByIdProduct();
                    break;
                case 4:
                    new ProductView().deleteByIdProduct();
                    break;
            }
        }
    }
}
