package org.example;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {

        try(Connection conn = ConnectionDB.getInstance()){
            Repository<Product> repository = new
                    Impl();
            listProducts(repository);
            getProductById(repository);
            //addProduct(repository);
            // updateProduct(repository);
            deleteProduct(repository);
        }catch (SQLException e) {
            e.printStackTrace();
        }


    }
}