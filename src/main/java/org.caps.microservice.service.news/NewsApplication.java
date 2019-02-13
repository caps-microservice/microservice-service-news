package org.caps.microservice.service.news;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author caps
 */
@EnableSwagger2
@SpringBootApplication(scanBasePackages = "org.caps.microservice")
@EnableEurekaClient
@MapperScan(basePackages =  "org.caps.microservice.service.news.mapper")
public class NewsApplication {
    public static void main(String[] args) {
        SpringApplication.run(NewsApplication.class, args);
    }
}