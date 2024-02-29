package com.metehangecin.ecommerce.dto;

import com.metehangecin.ecommerce.entity.Address;
import com.metehangecin.ecommerce.entity.Customer;
import com.metehangecin.ecommerce.entity.Order;
import com.metehangecin.ecommerce.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {

    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;

}
