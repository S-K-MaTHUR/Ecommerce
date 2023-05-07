package com.geekster.Ecommerce.repository;

import com.geekster.Ecommerce.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserDao extends JpaRepository<UserModel,Integer> {
}
