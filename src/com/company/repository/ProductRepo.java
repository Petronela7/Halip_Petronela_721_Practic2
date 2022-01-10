package com.company.repository;

import com.company.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductRepo implements RepoInterface{
    private List<Product> productList;

    public ProductRepo()
    {
        productList = new ArrayList<>();
    }
    /**
     * This method adds a product to the list
     *
     * @param name
     * @param price
     * @param SKU
     * @param initialNumber
     * @return final product
     */
    @Override
    public Product addProduct(String name, Double price, String SKU, Integer initialNumber) {
        Product product = new Product(name,price,SKU,initialNumber);
        productList.add(product);
        return product;
    }

    /**
     * Deletes product from list
     *
     * @param name
     */
    @Override
    public void deleteProduct(String name) {
          productList.removeIf(product -> product.getName().equals(name));
    }

    /**
     * Updates a product identified by its name
     *
     * @param name
     * @param price
     * @param SKU
     * @param initialNumber
     */
    @Override
    public void updateProduct(String name, Double price, String SKU, Integer initialNumber) {
        for(Product product:productList)
        {
            if(product.getName().equals(name))
            {
                product.setPrice(price);
                product.setSKU(SKU);
                product.setInitialNumber(initialNumber);
            }
        }

    }

    /**
     * Returns a product from the list by Name
     *
     * @param name
     * @return
     */
    @Override
    public Product findByName(String name) {
        for(Product product:productList)
        {
            if(product.getName().equals(name))
            {
                return product;
            }
        }
        return null;
    }
}
