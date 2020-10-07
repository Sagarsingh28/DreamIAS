package mConfiguration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages= "myController")
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
	
}
