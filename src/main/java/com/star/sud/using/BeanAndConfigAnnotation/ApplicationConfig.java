package com.star.sud.using.BeanAndConfigAnnotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.star.sud.using.BeanAndConfigAnnotation.service.ITechnologyService;
import com.star.sud.using.BeanAndConfigAnnotation.service.TechnologyServiceImpl;

@Configuration
public class ApplicationConfig {

	@Bean
	public ITechnologyService technologyService() {
		return new TechnologyServiceImpl();
	}
}
