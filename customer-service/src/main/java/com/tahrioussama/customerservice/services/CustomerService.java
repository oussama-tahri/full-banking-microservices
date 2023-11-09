package com.tahrioussama.customerservice.services;

import com.tahrioussama.customerservice.dtos.CustomerRequestDTO;
import com.tahrioussama.customerservice.dtos.CustomerResponseDTO;
import com.tahrioussama.customerservice.exceptions.CustomerNotFoundException;
import com.tahrioussama.customerservice.exceptions.EmailAlreadyUsedException;

import java.util.List;

public interface CustomerService {
    CustomerResponseDTO save(CustomerRequestDTO request) throws EmailAlreadyUsedException;
    List<CustomerResponseDTO> listCustomers();
    CustomerResponseDTO getCustomerById(Long id) throws CustomerNotFoundException;
    CustomerResponseDTO update(CustomerRequestDTO requestDTO) throws CustomerNotFoundException, EmailAlreadyUsedException;
    void deleteCustomer(Long id) throws CustomerNotFoundException;
    List<CustomerResponseDTO> findCustomers(String keyword);
}
