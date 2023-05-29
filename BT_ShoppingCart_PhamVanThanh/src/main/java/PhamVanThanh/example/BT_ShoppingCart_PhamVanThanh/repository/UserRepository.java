package PhamVanThanh.example.BT_ShoppingCart_PhamVanThanh.repository;

import PhamVanThanh.example.BT_ShoppingCart_PhamVanThanh.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByUsername(String username);

    Boolean existsByEmail(String email);

    Optional<User> findByUsernameOrEmail(String username, String email);

    boolean existsByUsername(String username);
}