package com.geekster.Ecommerce.repository;

import com.geekster.Ecommerce.model.OrderModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IOrderDao extends JpaRepository<OrderModel,Integer> {
}
