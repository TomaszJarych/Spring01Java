package pl.coderslab.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan("pl.coderslab")
public class AppConfig {
//	@Bean
//	public HelloWorld helloWorld() {
//		return new HelloWorld();
//	}
	
	
	@Bean
	public Captain jackSparrow() {
	    return new Captain();
	}

	@Bean
	public Ship blackPearl() {
	    return new Ship(jackSparrow());
	}

	@Bean
	public Scope1 scope1() {
		return new Scope1();
	}
	
	@Bean
	@Scope("prototype")
	public Scope2 scope2() {
		return new Scope2();
	}
}
