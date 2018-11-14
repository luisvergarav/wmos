package rtl.sod.corp.configservicev10;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer  
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		 for(String arg:args) {
	            System.out.println(arg);
	        }
		SpringApplication.run(Application.class, args);
	}
}
