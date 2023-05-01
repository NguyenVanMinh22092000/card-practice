package com.vanminh.cartpractice.Dto;

import com.vanminh.cartpractice.domain.Product;

import java.util.List;

public record CartDto(Long id, String name, List<Product> products) {
}
