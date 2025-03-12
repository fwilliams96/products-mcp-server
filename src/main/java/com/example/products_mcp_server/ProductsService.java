package com.example.products_mcp_server;

import org.springframework.ai.tool.annotation.Tool;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductsService {

    private final ProductsRepository productsRepository;

    public ProductsService(ProductsRepository productsRepository) {
        this.productsRepository = productsRepository;
    }

    @Tool(description = "Get available products")
    public List<Product> getAvailableProducts() {
        return productsRepository.getAllProducts().stream()
                .filter(Product::isAvailable).toList();
    }

}
