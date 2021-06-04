package solflower.choi.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class SolflowerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SolflowerApplication.class, args);
	}

}
