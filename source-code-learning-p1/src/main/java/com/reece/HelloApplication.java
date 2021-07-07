package com.reece;

import com.reece.service.HelloService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author: jingyun
 * @since: 2021/7/8 01:08
 */
@Configuration
@ComponentScan("com.reece.service")
public class HelloApplication {


	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(HelloApplication.class);
		HelloService helloService = context.getBean(HelloService.class);
		helloService.hello();

	}

}
