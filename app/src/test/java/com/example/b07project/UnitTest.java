package com.example.b07project;

import org.junit.Test;

import static org.junit.Assert.*;

import android.app.Application;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class UnitTest{
    @Test
    public void Product_test(){
        Product product = new Product("Nestle","Water","0.99");
        System.out.println(product);
    }

    @Test
    public void OrderedProduct_test(){
        OrderedProduct orderedProduct = new OrderedProduct("Nestle","Water","0.99",2);
        System.out.println(orderedProduct);
    }

    @Test
    public void ProductList_test_hash(){
        Product p1 = new Product("Nestle","water","0.99");
        Product p2 = new Product("Alokozay","tissue","2.99");
        Product p3 = new Product("Nintendo","switch console","399");
        Product p4 = new Product("Casio","calculator","30");
        StoreOwner store1 = new StoreOwner("Walmart","123 trail");
        ProductList pl1 = store1.getProductList();
        StoreOwner store2 = new StoreOwner("Dollarma","124 trail");
        ProductList pl2 = store2.getProductList();
        pl1.addProduct(p1);
        pl1.addProduct(p2);
        pl2.addProduct(p3);
        pl2.addProduct(p4);
        System.out.println(pl1);
        System.out.println(pl1.hashCode());
        System.out.println(pl2);
        System.out.println(pl2.hashCode());
    }

    @Test
    public void ProductList_test_store(){
        Product p1 = new Product("Nestle","water","0.99");
        Product p2 = new Product("Alokozay","tissue","2.99");
        Product p3 = new Product("Nintendo","switch console","399");
        Product p4 = new Product("Casio","calculator","30");
        StoreOwner store1 = new StoreOwner("Walmart","123 trail");
        ProductList pl1 = store1.getProductList();
        StoreOwner store2 = new StoreOwner("Dollarma","124 trail");
        ProductList pl2 = store2.getProductList();
        pl1.addProduct(p1);
        pl1.addProduct(p2);
        pl2.addProduct(p3);
        pl2.addProduct(p4);
        System.out.println(pl1);
        System.out.println(pl1.hashCode());
        System.out.println(pl1.getStoreOwner());
        System.out.println(pl2);
        System.out.println(pl2.hashCode());
        System.out.println(pl2.getStoreOwner());
    }

/*    @Test
    public void ProductList_test_DB(){
        Product p1 = new Product("Nestle","water","0.99");
        Product p2 = new Product("Alokozay","tissue","2.99");
        Product p3 = new Product("Nintendo","switch console","399");
        Product p4 = new Product("Casio","calculator","30");
        StoreOwner store1 = new StoreOwner("Walmart","123 trail");
        ProductList pl1 = store1.getProductList();
        StoreOwner store2 = new StoreOwner("Dollarma","124 trail");
        ProductList pl2 = store2.getProductList();
        pl1.addProduct(p1);
        pl1.addProduct(p2);
        pl2.addProduct(p3);
        pl2.addProduct(p4);
        pl1.submitToDB();
        pl2.submitToDB();
    }

    @Test
    public void DB_test_submit(){
        DatabaseReference ref = FirebaseDatabase.getInstance().getReference();
        Order order = new Order("s002","p002","5");
        ref.child("order").child("3").setValue(order);
    }*/
}