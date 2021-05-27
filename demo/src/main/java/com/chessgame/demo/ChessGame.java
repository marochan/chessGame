package com.chessgame.demo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.chessgame.demo.services.ChessGameService; 

@Configuration
@ComponentScan
@EnableAutoConfiguration
public class ChessGame{
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		SpringApplication.run(ChessGame.class, args);
		/*// loading the definitions from the given XML file
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
		*/
	}
}
	