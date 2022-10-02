package poly.edu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class Java6StoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(Java6StoreApplication.class, args);
	}
	
}
