package com.vanminh.cartpractice.service.impl;

import com.vanminh.cartpractice.Dto.CartDto;
import com.vanminh.cartpractice.domain.Cart;
import com.vanminh.cartpractice.mapper.CartDtoMapper;
import com.vanminh.cartpractice.repository.CartRepo;
import com.vanminh.cartpractice.service.CartService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CartImpl implements CartService {

    private final CartRepo cartRepo;
    private final CartDtoMapper cartDtoMapper;
    @Override
    public List<CartDto> findAllCarts() {
        return   cartRepo.findAll().stream().map(cartDtoMapper).collect(Collectors.toList());
    };


}
