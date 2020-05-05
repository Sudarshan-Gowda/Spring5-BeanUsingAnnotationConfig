# Spring5 beans using annotation configuration

This repo will demonstrate how to create spring beans using annotations (via java configuration) for any standalone application. 

## There are two ways we can create the bean
•	Using component annotations
•	Using @Bean annotations

### 1.	Using component scanning

1.1 We can use any one of following four annotations as appropriate.

      @Component
      @Repository
      @Service
      @Controller
     

In this repo example we used `@Service` annotation to get bean

``
@Service
public class TechnologyServiceImpl implements ITechnologyService
``


1.2	Include bean packages in `@ComponentScan` annotation

``
	@Configuration<br>
	@ComponentScan(basePackages = "com.star.sud.using.ComponentScanAnnotation.service")
	public class ApplicationConfig
``


### 2.	Using @Bean annotations
1.1	Create Java bean classes without any annotation.

``
public class TechnologyServiceImpl implements ITechnologyService 
``


1.2	Use @Bean annotation methods in configuration class

``
@Configuration
public class ApplicationConfig {
@Bean
public ITechnologyService technologyService() {
	return new TechnologyServiceImpl();
   }
 }
``


## Result of this Application:
``
TechnologyDetails [techId=1, techName=Java, techDescription=Welcome to Java Learning!]
``
