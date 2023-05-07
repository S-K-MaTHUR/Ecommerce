package com.geekster.Ecommerce.controller;

import com.geekster.Ecommerce.model.AddressModel;
import com.geekster.Ecommerce.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressController {

    @Autowired
    AddressService addressService;

    @PostMapping("/")
    public String addAddress(@RequestBody AddressModel address){
        return addressService.addAddress(address);
    }
}
