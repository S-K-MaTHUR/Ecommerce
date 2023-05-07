package com.geekster.Ecommerce.service;

import com.geekster.Ecommerce.model.AddressModel;
import com.geekster.Ecommerce.model.OrderModel;
import com.geekster.Ecommerce.model.ProductModel;
import com.geekster.Ecommerce.model.UserModel;
import com.geekster.Ecommerce.repository.IAddressDao;
import com.geekster.Ecommerce.repository.IOrderDao;
import com.geekster.Ecommerce.repository.IProductDao;
import com.geekster.Ecommerce.repository.IUserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    IOrderDao orderDao;

    @Autowired
    IUserDao userDao;

    @Autowired
    IAddressDao addressDao;

    @Autowired
    IProductDao productDao;

    public String addOrders(OrderModel order){
        UserModel user = order.getUserId();
        AddressModel address = order.getAddressId();
        ProductModel product = order.getProductId();

        Optional<UserModel> userList = userDao.findById((user.getUserId()));

        Optional<AddressModel> addressList = addressDao.findById(address.getAddressId());

        Optional<ProductModel> productList = productDao.findById(product.getProductId());

        if(userList.isEmpty()){
            return "Invalid userId occurred.........check carefully";
        }else if(addressList.isEmpty()){
            return "Please, enter the correct addressId.....";
        }else if(productList.isEmpty()){
            return "Enter the correct productId";
        }else{
            order.setUserId((userList.get()));
            order.setAddressId(addressList.get());
            order.setProductId(productList.get());
            orderDao.save(order);

            return "Congratulation, Your Order placed Successfully.....!!!!!";
        }
    }
    public OrderModel getOrders(Integer orderId){
        Optional<OrderModel> orders = orderDao.findById(orderId);
        if(orders.isEmpty()){
            throw new IllegalStateException("User with orderId: "+orderId+" not found...!!");
        }
        else{
            return orders.get();
        }
    }
}
