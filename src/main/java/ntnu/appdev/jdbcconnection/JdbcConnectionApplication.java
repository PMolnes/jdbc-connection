package ntnu.appdev.jdbcconnection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication (exclude = DataSourceAutoConfiguration.class)
public class JdbcConnectionApplication {

	public static void main(String[] args) {
		SpringApplication.run(JdbcConnectionApplication.class, args);
	}

}
