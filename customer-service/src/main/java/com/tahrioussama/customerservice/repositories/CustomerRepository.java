package com.tahrioussama.customerservice.repositories;

import com.tahrioussama.customerservice.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface CustomerRepository extends JpaRepository<Customer,Long> {

    @Query("select c from Customer c where (c.firstName like :kw)" +
            "or (c.lastName like :kw) or (c.email like :kw)")
    List<Customer> searchCustomers(@Param("kw") String kw);


    @Query("select case when count(c) > 0 then true else false end from Customer c where c.email =?1")
                                                                // where c.email = ?1: This is a filter condition.
    // It checks if the "email" attribute of the "Customer" entity (aliased as "c") is equal to the value provided
                                                                                    // as the first parameter (?1).
                            // The ?1 is a placeholder for a parameter that will be set when the query is executed.
    Boolean checkIfEmailExists(String email);
    List<Customer> findByFirstNameContains(String fn);
    List<Customer> findByFirstNameContainsOrLastNameContains(String fn, String ln);

}
