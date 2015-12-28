package com.my.company.core;

import javax.sql.DataSource;

import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DaoConfig {
	
	@Bean
	public DataSource dataSource() {
		DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
		dataSourceBuilder.password("Post@123");
		dataSourceBuilder.url("jdbc:postgresql://localhost:5432/hibernate");
		dataSourceBuilder.username("postgres");
		dataSourceBuilder.driverClassName("org.postgresql.Driver");
		return dataSourceBuilder.build();
	}
}
