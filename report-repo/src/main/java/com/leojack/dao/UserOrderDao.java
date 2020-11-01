package com.leojack.dao;


import com.leojack.entity.UserOrder;
import org.springframework.stereotype.Repository;

@Repository
public interface UserOrderDao {

       UserOrder getAllOrder();

}
