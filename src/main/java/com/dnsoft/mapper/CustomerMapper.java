package com.dnsoft.mapper;

import com.dnsoft.pojo.Customer;

public interface CustomerMapper {
    public Customer findCustomerById(Integer id);
    public void addCustomer(Customer customer);
}
