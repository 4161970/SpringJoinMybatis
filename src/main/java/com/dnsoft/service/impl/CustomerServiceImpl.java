package com.dnsoft.service.impl;

import com.dnsoft.mapper.CustomerMapper;
import com.dnsoft.pojo.Customer;
import com.dnsoft.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service    //使用@Service来表示业务层的类
@Transactional
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerMapper customerMapper;
    public void addCustomer(Customer customer){
        customerMapper.addCustomer(customer);
        int i=1/0;
    }
}