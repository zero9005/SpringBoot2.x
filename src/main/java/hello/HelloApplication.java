package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.qincai")
public class HelloApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(HelloApplication.class, args);
	}

}