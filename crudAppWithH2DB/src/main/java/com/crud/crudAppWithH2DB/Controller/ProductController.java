package com.crud.crudAppWithH2DB.Controller;

import com.crud.crudAppWithH2DB.Entity.Product;
import com.crud.crudAppWithH2DB.Services.ProductService;
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
        return productService.getProducts();
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

    @PutMapping("/updateproduct/{prodId}")
    public void updateProduct(@PathVariable int prodId, @RequestBody Product newProd)
    {
        productService.updateProduct(prodId,newProd);
    }
    @DeleteMapping("/deleteproduct/{prodId}")
    public void deleteProdbyId(@PathVariable int prodId)
    {
        productService.deleteProduct(prodId);
    }

}
