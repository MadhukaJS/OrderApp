package com.example.demo.repo;

import com.example.demo.entity.customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CusRepo extends JpaRepository<customer,Integer> {
}
