package com.vanminh.cartpractice.service.impl;

import com.vanminh.cartpractice.domain.Cart;
import com.vanminh.cartpractice.repository.CartRepo;
import com.vanminh.cartpractice.service.CartService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CartImpl implements CartService {

    private final CartRepo cartRepo;
    @Override
    public List<Cart> findAllCarts() {
       return   cartRepo.findAll();
    };
}
