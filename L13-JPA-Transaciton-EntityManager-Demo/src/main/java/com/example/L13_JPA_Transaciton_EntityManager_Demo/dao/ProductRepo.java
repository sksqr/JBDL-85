package com.example.L13_JPA_Transaciton_EntityManager_Demo.dao;

import com.example.L13_JPA_Transaciton_EntityManager_Demo.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends JpaRepository<Product,Long> {
}
