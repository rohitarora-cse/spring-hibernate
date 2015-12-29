package com.my.company.core;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;

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
	
	@Bean
	public SessionFactory sessionFactory() {
/*		LocalSessionFactoryBean localSessionFactoryBean = new LocalSessionFactoryBean();
		localSessionFactoryBean.setDataSource(dataSource);
		return localSessionFactoryBean.getObject();
*/
		LocalSessionFactoryBuilder builder = new LocalSessionFactoryBuilder(dataSource());
		/*scan packages not required because @EnableAutoConfiguration by default scans "com.my.company" package.*/
		builder.scanPackages("com.my.company.core.domain");
		return builder.buildSessionFactory();
	}
	
	@Bean
	public HibernateTransactionManager transactionManager() {
		return new HibernateTransactionManager(sessionFactory());
	}
}
