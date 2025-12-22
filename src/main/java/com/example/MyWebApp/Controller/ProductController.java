package com.example.MyWebApp.Controller;


import com.example.MyWebApp.Model.Product;
import com.example.MyWebApp.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class ProductController {


    @Autowired

    ProductService service;
    @RequestMapping("/products")
    public List<Product> getProducts(){

        return service.getProducts();
    }
    @RequestMapping("/product/{prodid}")
    public Product getproductbyId(@PathVariable  int prodid){
        return  service.getproductbyId(prodid);
    }
}
