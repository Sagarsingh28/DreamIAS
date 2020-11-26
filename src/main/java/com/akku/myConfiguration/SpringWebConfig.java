package com.akku.myConfiguration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages= "com.akku")
public class SpringWebConfig implements WebMvcConfigurer {
	
//	@Bean
//	public InternalResourceViewResolver viewResolver() {
//		InternalResourceViewResolver vr = new InternalResourceViewResolver();
//		vr.setPrefix("/WEB-INF/jsp/");
//		vr.setSuffix(".jsp");
//		return vr;
//	}
	
//	2nd WAY
//	@Bean
//	public InternalResourceViewResolver viewResolver() {
//		return new InternalResourceViewResolver("/WEB-INF/jsp/",".jsp");
//	}
	
//	3rd WAY
	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) {
		registry.jsp("/WEB-INF/jsp/",".jsp");
	}
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/resources/**").addResourceLocations("classpath:/static/");
	}
	
//	@Bean
//	DriverManagerDataSource getDataSource() {
//		DriverManagerDataSource dm = new DriverManagerDataSource();
//		dm.setDriverClassName("com.mysql.jdbc.Driver");
//		dm.setUrl("jdbc:mysql://localhost:3306/hiber");
//		dm.setUsername("root2");
//		dm.setPassword("7860");
//		return dm;
//	}
//	
//	@Bean
//	public JdbcTemplate jdbcTemplate() {
//		return new JdbcTemplate((javax.sql.DataSource) getDataSource());
//	}
}
