package guru.springframework.joke.spring5jokesapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:chuck-config.xml")
public class Spring5JokesappApplication {

	public static void main(String[] args) {
		SpringApplication.run(Spring5JokesappApplication.class, args);
	}

}
