package com.app;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.Ordered;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;


@org.springframework.context.annotation.Configuration
@EnableWebMvc
@ComponentScan(basePackages="com.app")
public class Configuration extends WebMvcConfigurerAdapter {
	
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		 registry.addViewController("/").setViewName("login");
		 registry.setOrder(Ordered.HIGHEST_PRECEDENCE);
	}
	
	
	
}
