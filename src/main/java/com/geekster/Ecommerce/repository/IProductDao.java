package com.geekster.Ecommerce.repository;

import com.geekster.Ecommerce.model.ProductModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IProductDao extends JpaRepository <ProductModel,Integer> {
    List<ProductModel> findByCategory(String category);
}
