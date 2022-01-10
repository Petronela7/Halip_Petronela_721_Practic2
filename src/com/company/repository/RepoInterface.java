package com.company.repository;

import com.company.model.Product;

public interface RepoInterface {
    /**
     * This method adds a product to the list
     * @param name
     * @param price
     * @param SKU
     * @param initialNumber
     * @return final product
     */
    Product addProduct(String name, Double price, String SKU, Integer initialNumber);

    /**
     * Deletes product from list
     * @param name
     */
    void deleteProduct(String name);

    /**
     * Updates a product identified by its name
     * @param name
     * @param price
     * @param SKU
     * @param initialNumber
     */
    void updateProduct(String name, Double price, String SKU, Integer initialNumber);

    /**
     * Returns a product from the list by Name
     * @param name
     * @return
     */
    Product findByName(String name);
}
