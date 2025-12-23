package com.example.MyWebApp.Service;

import com.example.MyWebApp.Model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

@Service
public class ProductService {
    List<Product> products=new ArrayList<>(Arrays.asList(new Product(100,"laptop",60000),
            new Product(101,"mobile",80000)));
     public List<Product> getProducts(){
        return products;

    }
    public Product getproductbyId(int prodid){
         return products.stream().filter(p->p.getProdId()==prodid).findFirst().get();

    }
    public void addproduct(Product prod){
         products.add(prod);
    }
    public void  updateproduct(Product prod){
         int idx=0;
         for(int i=0;i<products.size();i++){
             if(products.get(i).getProdId()==prod.getProdId())
                 idx=i;
         }
        products.set(idx, prod);
    }
    public void  deleteproduct(int prodid){
         products.removeIf(p->p.getProdId()==prodid);
    }
}
