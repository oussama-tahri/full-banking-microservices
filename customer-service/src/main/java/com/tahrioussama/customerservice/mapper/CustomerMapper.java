package com.tahrioussama.customerservice.mapper;

import com.tahrioussama.customerservice.dtos.CustomerRequestDTO;
import com.tahrioussama.customerservice.dtos.CustomerResponseDTO;
import com.tahrioussama.customerservice.entities.Customer;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class CustomerMapper {
    private ModelMapper mapper = new ModelMapper();

    public CustomerResponseDTO from(Customer customer) {
        return mapper.map(customer, CustomerResponseDTO.class);
    }

    public Customer from(CustomerRequestDTO customerRequestDTO) {
        return mapper.map(customerRequestDTO, Customer.class);
    }
}
