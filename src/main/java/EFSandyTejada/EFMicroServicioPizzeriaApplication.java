package EFSandyTejada;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
@EnableFeignClients
@SpringBootApplication
public class EFMicroServicioPizzeriaApplication {

	public static void main(String[] args) {
		SpringApplication.run(EFMicroServicioPizzeriaApplication.class, args);
	}

}
