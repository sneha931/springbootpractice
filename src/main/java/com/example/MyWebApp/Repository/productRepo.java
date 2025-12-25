package com.example.MyWebApp.Repository;

import com.example.MyWebApp.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface productRepo  extends JpaRepository<Product,Integer> {

}
