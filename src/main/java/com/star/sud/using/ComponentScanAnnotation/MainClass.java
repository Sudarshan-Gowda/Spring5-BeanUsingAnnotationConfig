package com.star.sud.using.ComponentScanAnnotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.star.sud.using.ComponentScanAnnotation.service.ITechnologyService;
import com.star.sud.using.ComponentScanAnnotation.service.TechnologyServiceImpl;
import com.star.sud.using.annotation.bean.TechnologyDetails;

public class MainClass {

	public static void main(String[] args) {

		try {
			// Approach - 1
			// ApplicationContext context = new
			// AnnotationConfigApplicationContext(ApplicationConfig.class);

			// Approach - 2
			AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
			context.register(ApplicationConfig.class);
			context.refresh();

			// Approach 2 can also be done in single line
			// AnnotationConfigApplicationContext context = new
			// AnnotationConfigApplicationContext(ApplicationConfig.class);

			ITechnologyService bean = context.getBean(TechnologyServiceImpl.class);
			TechnologyDetails technologyDetails = bean.getTechnologyDetails();
			System.out.println(technologyDetails);

			context.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
