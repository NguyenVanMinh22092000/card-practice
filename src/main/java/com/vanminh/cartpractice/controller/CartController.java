package com.vanminh.cartpractice.controller;

import com.vanminh.cartpractice.domain.Cart;
import com.vanminh.cartpractice.service.CartService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping(value = "/api/carts")
@RestController
@RequiredArgsConstructor
public class CartController {

    private final CartService cartService;

    @GetMapping
    public ResponseEntity<List<Cart>> findCarts() {
        List<Cart> carts = cartService.findAllCarts();
        return ResponseEntity.ok().body(carts);
    }
}