package com.vanminh.cartpractice.domain;

import lombok.Data;

import javax.persistence.*;
import java.security.Identity;
import java.util.Collection;
@Entity
@Data
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToMany(targetEntity = Product.class)
    private Collection<Product> products;
}
