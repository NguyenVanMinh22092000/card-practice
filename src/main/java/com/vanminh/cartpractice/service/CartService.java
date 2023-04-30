package com.vanminh.cartpractice.service;

import com.vanminh.cartpractice.domain.Cart;

import java.util.List;

public interface CartService {
    List<Cart> findAllCarts();
}
