package ie.atu.regservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class RegServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(RegServiceApplication.class, args);
    }

}
