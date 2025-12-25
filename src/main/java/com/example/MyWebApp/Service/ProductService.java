package com.example.MyWebApp.Service;

import com.example.MyWebApp.Model.Product;
import com.example.MyWebApp.Repository.productRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

@Service
public class ProductService {
    @Autowired
    productRepo repo;


//    List<Product> products=new ArrayList<>(Arrays.asList(new Product(100,"laptop",60000),
//            new Product(101,"mobile",80000)));
     public List<Product> getProducts(){
        return repo.findAll();

    }
    public Product getproductbyId(int prodid){
         return repo.findById(prodid).orElse(null);

    }
    public void addproduct(Product prod){
         repo.save(prod);
    }
    public void  updateproduct(Product prod){
        repo.save(prod);
    }
    public void  deleteproduct(int prodid){
         repo.deleteById(prodid);
    }
}
