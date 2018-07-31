package pl.coderslab.beans;

import java.time.LocalDateTime;

import org.springframework.stereotype.Component;
@Component
public class HelloWorld {
	
	public void hello() {
		System.out.println(LocalDateTime.now());
	}

}
