package com.crud.crudApp.Services;

import com.crud.crudApp.Entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService
{

    List<Product> prodList= new ArrayList<>(Arrays.asList(
            new Product(101,"Iphone",100000),
            new Product(102,"Samsung",150000),
            new Product(103,"Redmi",30000),
            new Product(104,"Oppo",15000)
    ));

    public List<Product> getProduct()
    {
        return prodList;
    }

    public Product getProductById(int prodid)
    {
        return prodList.stream()
                .filter(p->p.getProdId()==prodid)
                .findFirst().get();
    }

    public void addProduct(Product newProd)
    {
        prodList.add(newProd);
    }

    public void updateProduct(Product newProd)
    {
        this.prodList=prodList.stream()
                .map(p-> (p.getProdId()==newProd.getProdId() ? newProd : p)).toList();
    }

    public void deleteProduct(int prodId)
    {
        this.prodList=prodList.stream()
                .filter(p-> (p.getProdId()!=prodId )).toList();
    }
}
