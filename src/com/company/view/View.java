package com.company.view;

import com.company.repository.ProductRepo;

import java.util.ArrayList;
import java.util.Scanner;

public class View {
    private ProductRepo productRepo;

    public View(ProductRepo productRepo)
    {
            this.productRepo = productRepo;
            productRepo.addProduct("Cola",20.0,"rtw",2);
            productRepo.addProduct("Fanta",26.0,"er45",4);

    }
    public void run() {
        Scanner scanner = new Scanner(System.in);

        loop:
        while (true) {
            System.out.println("""
                     
                     0. Exit Program \r
                     1. Add a product \r
                     2. Delete product \r
                     3. Update product \r
                     
                    """);
            System.out.println("Enter input: ");
            int option = scanner.nextInt();
            System.out.println("You've entered: " + option);
            switch (option) {
                case 0:
                    break loop;
                case 1:
                    addProductView();
                    break;
                case 2:
                    deleteProductView();
                    break;
                case 3:
                    updateProductView();
                    break;

        }
    }

}

    private void updateProductView() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter ProductName:");
        try {
            String name = scanner.next();
            System.out.println("Enter Price:");
            double price = scanner.nextInt();
            System.out.println("Enter SKU:");
            String sku = scanner.nextLine();
            System.out.println("Enter initial price:");
            Integer i_price = scanner.nextInt();

            productRepo.updateProduct(name, price,sku,i_price);
        } catch (Exception e) {
            throw e;
        }
    }


    private void deleteProductView() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter ProductName :");
        try {
            String name = scanner.next();

            productRepo.deleteProduct(name);
        } catch (Exception e) {
            throw e;
        }
    }



    private void addProductView() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter ProductName:");
        try {
            String name = scanner.next();
            System.out.println("Enter Price:");
            double price = scanner.nextInt();
            System.out.println("Enter SKU:");
            String sku = scanner.nextLine();
            System.out.println("Enter initial price:");
            Integer i_price = scanner.nextInt();

            productRepo.addProduct(name, price,sku,i_price);
        } catch (Exception e) {
            throw e;
        }
    }
    }
