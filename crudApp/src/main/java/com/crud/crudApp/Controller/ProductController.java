package com.crud.crudApp.Controller;

import com.crud.crudApp.Entity.Product;
import com.crud.crudApp.Services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("/getproducts")
    public List<Product> getProductList()
    {
        return productService.getProduct();
    }

    @GetMapping("/getproduct/{prodId}")
    public Product getProductById(@PathVariable int prodId)
    {
        return productService.getProductById(prodId);
    }

    @PostMapping("/addproduct")
    public void addProduct(@RequestBody Product newProd)
    {
        productService.addProduct(newProd);
    }

    @PutMapping("/updateproduct")
    public void updateProduct(@RequestBody Product newProd)
    {
        productService.updateProduct(newProd);
    }
    @DeleteMapping("/deleteproduct/{prodId}")
    public void deleteProdbyId(@PathVariable int prodId)
    {
        productService.deleteProduct(prodId);
    }

}
