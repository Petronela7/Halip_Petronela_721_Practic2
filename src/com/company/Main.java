package com.company;

import com.company.repository.ProductRepo;
import com.company.view.View;

public class Main {

    public static void main(String[] args) {
        ProductRepo productRepo = new ProductRepo();
        View view = new View(productRepo);
        view.run();
    }
}
