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
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer orderId;



    private Integer productQuantity;
}
