package PhamVanThanh.example.BT_ShoppingCart_PhamVanThanh.service;

import PhamVanThanh.example.BT_ShoppingCart_PhamVanThanh.model.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAllProducts();
    void saveProduct(Product product);
    Product getProductById(int id);
    void deleteProductById(int id);
}
