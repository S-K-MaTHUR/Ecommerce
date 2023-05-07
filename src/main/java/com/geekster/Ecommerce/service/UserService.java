package com.geekster.Ecommerce.service;

import com.geekster.Ecommerce.model.UserModel;
import com.geekster.Ecommerce.repository.IUserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    IUserDao userDao;

    public String addUsers(List<UserModel> users){
        List<UserModel> list = userDao.saveAll(users);

        if(list==null){
            return "Users are not added !!!!";
        }else{
            return "Users are added successfully....!!!";
        }
    }
    public UserModel getUser(Integer userId){
        Optional<UserModel> user = userDao.findById((userId));

        if (user.isEmpty()) {
            throw new IllegalStateException("User with userId: " + userId + " not found!!" );
        }
        else {
            return user.get();
        }
    }
}
