package com.star.sud.using.ComponentScanAnnotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.star.sud.using.ComponentScanAnnotation.service")
public class ApplicationConfig {

}
