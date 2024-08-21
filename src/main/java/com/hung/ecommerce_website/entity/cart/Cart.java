package com.hung.ecommerce_website.entity.cart;

import com.hung.ecommerce_website.entity.user.Users;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.cglib.core.Local;

import java.time.LocalDateTime;

@Data
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Cart")
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    LocalDateTime createdAt;
    LocalDateTime updatedAt;
    @OneToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinColumn(name = "users_id")
    private Users users;
}
