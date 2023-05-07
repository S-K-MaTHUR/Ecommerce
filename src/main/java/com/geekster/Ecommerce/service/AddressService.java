package com.geekster.Ecommerce.service;

import com.geekster.Ecommerce.model.AddressModel;
import com.geekster.Ecommerce.model.UserModel;
import com.geekster.Ecommerce.repository.IAddressDao;
import com.geekster.Ecommerce.repository.IUserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AddressService {

    @Autowired
    IAddressDao addressDao;

    @Autowired
    IUserDao userDao;

    public String addAddress(AddressModel address){
        UserModel user = address.getUserId();
        Optional<UserModel> list = userDao.findById((user.getUserId()));

        if(list.isEmpty()){
            return "Invalid address found.....!!!";
        }
        address.setUserId(list.get());
        addressDao.save(address);
        return "Address added Successfully....!!!";
    }

}
