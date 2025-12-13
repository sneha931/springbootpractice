package com.example.MyWebApp.Model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Product {
    private int ProdId;
    private String prodName;
    private int price;
}
