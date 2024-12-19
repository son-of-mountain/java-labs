package ma.fstt.serv_descover;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableEurekaServer
public class ServDescoverApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServDescoverApplication.class, args);
    }

}
