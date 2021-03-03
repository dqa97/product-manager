package com.codegym.service;

import com.codegym.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceImpl implements ProductService {
    private static Map<Integer, Product> products;

    static {

        products = new HashMap<>();
        products.put(1, new Product(1, "Iphone5", 1000000 , "3" ,  "Like New"));
        products.put(2, new Product(2, "Iphone6", 1500000, "1" , "Second Hand"));
        products.put(3, new Product(3, "Iphone7", 3000000, "2" , "Made in china"));
        products.put(4, new Product(4, "Iphone8", 3500000 , "6" , "Android"));
        products.put(5, new Product(5, "Iphone11 promax", 25000000 , "5" , "Made in Japan"));

    }

    @Override
    public List findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void save(Product product) {
        products.put(product.getId(), product);
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public void update(int id, Product product) {
        products.put(id, product);
    }

    @Override
    public void remote(int id) {
        products.remove(id);
    }
}
