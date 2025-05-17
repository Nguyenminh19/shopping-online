package org.roninhub.shopping.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;

@Configurable
public class DatabaseConfig {

	@Bean
	public DataSource getDataSource() {
		@SuppressWarnings("rawtypes")
		DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
		dataSourceBuilder.driverClassName("com.mysql.cj.jdbc.Driver");
		dataSourceBuilder.url("jdbc:mysql://localhost:3306/demo_sql");
		dataSourceBuilder.username("root");
		dataSourceBuilder.password("g5^Vmmmd2gct");
		return dataSourceBuilder.build();
	}
}
