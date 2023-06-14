package com.example.customer.service.repositories;


import com.example.customer.service.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource
public interface CustomerRepository extends JpaRepository<Customer,Long> {



}