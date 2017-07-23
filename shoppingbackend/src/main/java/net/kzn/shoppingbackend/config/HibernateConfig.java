package net.kzn.shoppingbackend.config;

import java.util.Properties;

import javax.sql.DataSource;
import org.hibernate.SessionFactory;
import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan(basePackages = "net.kzn.shoppingbackend.dto")
@EnableTransactionManagement
public class HibernateConfig {

	public final static String DATABASE_URL = "jdbc:h2:tcp://localhost/~/onlineshopping";
	public final static String DATABASE_DRIVER = "org.h2.Driver";
	public final static String DATABASE_DIALECT = "org.hibernate.dialect.H2Dialect";
	public final static String DATABASE_USERNAME = "sa";
	public final static String DATABASE_PASSWORD = "";

	@Bean
	public DataSource getDataSource() {

		BasicDataSource basicDataSource = new BasicDataSource();
		basicDataSource.setDriverClassName(DATABASE_DRIVER);
		basicDataSource.setUrl(DATABASE_URL);
		basicDataSource.setUsername(DATABASE_USERNAME);
		basicDataSource.setPassword(DATABASE_PASSWORD);

		return basicDataSource;

	}

	@Bean
	public SessionFactory getSessionFactory(DataSource datasource) {

		LocalSessionFactoryBuilder builder = new LocalSessionFactoryBuilder(datasource);
		builder.addProperties(getHibernatePropreties());
		builder.scanPackages("net.kzn.shoppingbackend.dto");
		return builder.buildSessionFactory();
	}

	private Properties getHibernatePropreties() {
		Properties properties =new Properties();
		properties.put("hibernate.dialect", DATABASE_DIALECT);
		properties.put("hibernate.show_sql", "true");
		properties.put("hibernate.format_sql", "true");
		
		
		return properties;
	}
	
	@Bean
	public HibernateTransactionManager getTransactionManager(SessionFactory sessionFactory) {
		HibernateTransactionManager transactionManager=new HibernateTransactionManager(sessionFactory);

		return transactionManager;
		
	}

}
