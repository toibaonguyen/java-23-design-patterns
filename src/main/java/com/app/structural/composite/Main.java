package com.app.structural.composite;

import com.app.structural.composite.composite.Box;
import com.app.structural.composite.leaf.NewProduct;
import com.app.structural.composite.leaf.Product;
import com.app.structural.composite.leaf.UsedProduct;

public class Main {
    public static void main(String[] args) {
        Box box=new Box();

        //children
        Product product1=new NewProduct(100000);
        Product product2=new UsedProduct(99000);
        Product product3=new NewProduct(15000);
        Product product4=new UsedProduct(30000);

        //add children to the 1st inner container
        Box innerBox1=new Box();
        innerBox1.add(product1);
        innerBox1.add(product2);

        //add children to the 2nd inner container
        Box innerBox2=new Box();
        innerBox2.add(product3);

        //add children to the biggest container
        box.add(innerBox1);
        box.add(innerBox2);
        box.add(product4);

        System.out.println("The value of the box: "+box.getTotalPrice());
    }
}
