package com.mayur.hazlecast.EmbeddedCache.Item;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@EnableCaching
public class ItemApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(ItemApplication.class, args);
    }
}
