package com.microservices.test.api.repository;

import com.microservices.test.api.model.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Akhmat on 05.02.2017.
 */
@Repository
public interface ProductRepository extends CrudRepository<Product,String>{

    Product findByName(String name);

}
