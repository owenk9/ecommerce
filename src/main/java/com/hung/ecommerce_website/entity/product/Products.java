package com.hung.ecommerce_website.entity.product;

import com.hung.ecommerce_website.entity.category.Categories;
import com.hung.ecommerce_website.entity.order.OrderDetails;
import com.hung.ecommerce_website.entity.review.Reviews;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Products")
public class Products {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String image;
    private String description;
    private double price;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "categories_id")
    private Categories categories;
    @OneToMany(mappedBy = "products", cascade = CascadeType.ALL)
    private List<Reviews> reviews;
    @OneToMany(mappedBy = "products", cascade = CascadeType.ALL)
    private List<OrderDetails> orderDetails;
}
