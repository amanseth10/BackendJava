package com.crud.crudAppWithH2DB.Services;

import com.crud.crudAppWithH2DB.Entity.Product;
import com.crud.crudAppWithH2DB.Repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class ProductService
{
    @Autowired
    ProductRepo repo;

    public List<Product> getProducts()
    {
        return repo.findAll();
    }

    public Product getProductById(int prodid)
    {
        return repo.findById(prodid).orElse(new Product());
    }

    public void addProduct(Product newProd)
    {
        repo.save(newProd);
    }

    public void updateProduct(int prodId,Product newProd)
    {
        Optional<Product> optionalProduct=repo.findById(prodId);
        if(optionalProduct.isPresent())
        {
            Product existingProduct=optionalProduct.get();
            existingProduct.setProdName(newProd.getProdName());
            existingProduct.setProdPrice(newProd.getProdPrice());
            repo.save(existingProduct);
        }
    }

    public void deleteProduct(int prodId)
    {
        repo.deleteById(prodId);
    }
}
