package hcs.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("hcs")
public class WebAppConfig {

    public static void main(String[] args) {
        SpringApplication.run(WebAppConfig.class, args);
    }

}
