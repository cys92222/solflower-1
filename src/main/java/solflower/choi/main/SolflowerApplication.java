package solflower.choi.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class SolflowerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SolflowerApplication.class, args);
	}

}
