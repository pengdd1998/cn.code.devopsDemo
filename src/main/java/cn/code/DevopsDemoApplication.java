package cn.code;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DevopsDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(DevopsDemoApplication.class, args);
    }

    @GetMapping("/demoApi")
    public String demoApi() {
        return "Hello World!";
    }
}