package com.chessgame.demo;
import java.util.Collection;
import java.util.stream.IntStream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chessgame.demo.services.ChessGameService;

@Controller
@SpringBootApplication
public class ChessGame extends SpringBootServletInitializer{
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		SpringApplication.run(ChessGame.class, args);
		// loading the definitions from the given XML file
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
 
		ChessGameService service = (ChessGameService) context
				.getBean("chessGameService");
		String message = service.sayHello();
		System.out.println(message);
 
		//set a new name
		service.setName("Spring");
		message = service.sayHello();
		System.out.println(message);
		
		
	}

@RestController
public class TomcatController {

    @GetMapping("/hello")
    public void sayHello() {
        System.out.println("Hello there");
    }
}
}