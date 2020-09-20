package br.com.fabricio.consumirgit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class ConsumirgitApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumirgitApplication.class, args);
    }

}
