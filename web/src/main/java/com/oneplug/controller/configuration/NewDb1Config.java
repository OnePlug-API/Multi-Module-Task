package com.oneplug.controller.configuration;


import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(basePackages = {"com.oneplug.controller.configuration"},
        mongoTemplateRef = NewDb1Config.MONGO_TEMPLATE
)
public class NewDb1Config {

    protected static final String MONGO_TEMPLATE = "newdb1MongoTemplate";
}
