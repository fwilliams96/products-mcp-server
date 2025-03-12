package com.example.products_mcp_server;

import org.springframework.ai.tool.ToolCallbackProvider;
import org.springframework.ai.tool.method.MethodToolCallbackProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class McpConfiguration {

    @Bean
    public ToolCallbackProvider productsTools(ProductsService productsService) {
        return MethodToolCallbackProvider.builder().toolObjects(productsService).build();
    }

}
