package com.vanminh.cartpractice.repository;

import com.vanminh.cartpractice.domain.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepo extends JpaRepository<Cart, Long> {

}
