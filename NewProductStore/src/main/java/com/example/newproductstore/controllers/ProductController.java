package com.example.newproductstore.controllers;

import com.example.newproductstore.models.Product;
import com.example.newproductstore.productdtos.FakeStoreProductDto;
import com.example.newproductstore.services.FakeStoreProductService;
import com.example.newproductstore.services.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//this controller is capable of hosting HTTP API's
@RestController
//localhost:8080/products ---> ProductController
@RequestMapping("/products")

public class ProductController {
    private ProductService productService;

    ProductController(ProductService productService){
        this.productService = productService;
    }

//    public Product getProductById(@PathVariable("id") Long ID){
//        return productService.getProductById(ID);
//    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> getProductByID(@PathVariable("id") Long id){
        ResponseEntity<Product> responseEntity = null;
        Product product = null;
        try{
            product = productService.getProductById(id);

        }
    }

}
