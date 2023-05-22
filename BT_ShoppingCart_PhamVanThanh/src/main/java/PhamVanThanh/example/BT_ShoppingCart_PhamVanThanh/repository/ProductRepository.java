package PhamVanThanh.example.BT_ShoppingCart_PhamVanThanh.repository;

import PhamVanThanh.example.BT_ShoppingCart_PhamVanThanh.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
}
