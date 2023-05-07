package com.geekster.Ecommerce.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class OrderModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer orderId;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserModel userId;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private ProductModel productId;

    @ManyToOne
    @JoinColumn(name = "address_id")
    private AddressModel addressId;

    @Column(name = "product_quantity")
    private Integer productQuantity;
}
