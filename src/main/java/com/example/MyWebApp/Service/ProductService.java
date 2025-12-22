package com.example.MyWebApp.Service;

import com.example.MyWebApp.Model.Product;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Arrays;

@Service
public class ProductService {
    List<Product> products=Arrays.asList(new Product(100,"laptop",60000),
            new Product(101,"mobile",80000));
     public List<Product> getProducts(){
        return products;

    }
    public Product getproductbyId(int prodid){
         return products.stream().filter(p->p.getProdId()==prodid).findFirst().get();

    }
}
