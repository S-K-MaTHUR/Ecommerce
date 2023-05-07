package com.geekster.Ecommerce.service;

import com.geekster.Ecommerce.model.ProductModel;
import com.geekster.Ecommerce.repository.IProductDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    IProductDao productDao;

    public String addProduct(List<ProductModel> products){
        List<ProductModel> productList = productDao.saveAll(products);
        if(productList == null){
            return "Product cannot be added....!!!";
        }else{
            return "Products add Successfully....!!!!!";
        }
    }
    public List<ProductModel> getProduct(String category){
        if(category == null){
            return productDao.findAll();
        }else{
            return productDao.findByCategory(category);
        }
    }
    public String removeProduct(Integer productId){
        Optional<ProductModel> productList = productDao.findById(productId);
        if(productList.isEmpty()){
            return "Product with productId: "+productId+" not found";
        }else{
            productDao.deleteById((productId));
            return "Product have been removed Successfully";
        }
    }
}
