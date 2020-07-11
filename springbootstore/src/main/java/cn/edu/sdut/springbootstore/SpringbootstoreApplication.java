package cn.edu.sdut.springbootstore;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "cn.edu.sdut.springbootstore.mapper")
public class SpringbootstoreApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringbootstoreApplication.class, args);
    }

}
