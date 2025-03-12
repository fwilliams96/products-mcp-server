package com.example.products_mcp_server;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ProductsRepository {

    private final List<Product> products = new ArrayList<>()
            {{
        add(new Product("Zapatillas Nike", "Muy chulas", 100.0, true));
        add(new Product("Zapatillas Adidas", "Las más nuevas", 200.0, false));
        add(new Product("Sudadera NorthFace", "Para los inviernos más fríos", 300.0, true));
    }};

    public List<Product> getAllProducts() {
        return products;
    }

}
