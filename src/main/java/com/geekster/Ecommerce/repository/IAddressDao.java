package com.geekster.Ecommerce.repository;

import com.geekster.Ecommerce.model.AddressModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAddressDao extends JpaRepository<AddressModel,Integer> {
}
