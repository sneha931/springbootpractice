package com.example.MyWebApp.Controller;


import com.example.MyWebApp.Model.Product;
import com.example.MyWebApp.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class ProductController {


    @Autowired

    ProductService service;
    @GetMapping("/products")
    public List<Product> getProducts(){

        return service.getProducts();
    }
    @GetMapping ("/product/{prodid}")
    public Product getproductbyId(@PathVariable  int prodid){
        return  service.getproductbyId(prodid);
    }

    @PostMapping("/products")
    public void addproduct(@RequestBody  Product prod){
        service.addproduct(prod);
    }

    @PutMapping("/products")
    public void updateproduct(@RequestBody Product prod){
        service.updateproduct(prod);
    }
    @DeleteMapping("/products/{prodid}")
    public void deleteproduct(@PathVariable int prodid){
        service.deleteproduct(prodid);
    }
}
