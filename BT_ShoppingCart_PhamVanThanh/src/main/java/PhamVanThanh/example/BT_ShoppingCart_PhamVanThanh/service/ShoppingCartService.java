package PhamVanThanh.example.BT_ShoppingCart_PhamVanThanh.service;

import PhamVanThanh.example.BT_ShoppingCart_PhamVanThanh.model.CartItem;

import java.util.Collection;

public interface ShoppingCartService {
    void add(CartItem newItem);
    void remove(int id);
    CartItem update(int productID, int quantity);
    void clear();
    double getAmount();
    int getCount();
    Collection<CartItem> getAllItems();
}
