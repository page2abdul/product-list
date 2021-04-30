package com.list.products;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@Configuration
public class SwaggerConfig {

	
	@Bean
	public Docket docket() {
		
		 return new Docket(DocumentationType.SWAGGER_2)
//	                .select()             
//	                .paths(PathSelectors.regex("*/*"))
//	                .build()
	                .apiInfo(metaData())
	                .produces(new HashSet<String>(Arrays.asList("application/json")))
	                .consumes(new HashSet<String>(Arrays.asList("application/json")))
	                ;
	}
	
	 private ApiInfo metaData() {		
	        ApiInfo apiInfo = new ApiInfo(
	                "",
	                "Product List Crud operation APIs",
	                "1.0",
	                "Terms of service",
	                new Contact("Latha", "https://Latha.com/about/", "latha@latha.com"),
	                "License Version 2.0",
	                "https://www.latha.com/licenses/LICENSE-2.0", Collections.EMPTY_LIST);
			        return apiInfo;
	 }
	
}
