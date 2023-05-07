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
public class AddressModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String landmark;
    private String phoneNumber;
    private String zipcode;
    private String state;

//    @ForeignKey
//    private UserId userId;

}
