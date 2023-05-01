package com.vanminh.cartpractice.mapper;

import com.vanminh.cartpractice.Dto.CartDto;
import com.vanminh.cartpractice.domain.Cart;
import com.vanminh.cartpractice.domain.Product;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.function.Function;
@Service
public class CartDtoMapper implements Function<Cart, CartDto> {
    @Override
    public CartDto apply(Cart cart) {
        return new CartDto(cart.getId(), cart.getName(), (List<Product>) cart.getProducts());
    }
}
