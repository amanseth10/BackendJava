package com.crud.crudAppWithH2DB.Repository;

import com.crud.crudAppWithH2DB.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends JpaRepository<Product,Integer> {
}
