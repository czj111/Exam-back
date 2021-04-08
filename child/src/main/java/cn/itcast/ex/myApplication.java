package cn.itcast.ex;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication //
@MapperScan("cn.itcast.ex.dao")
public class myApplication {
    public static void main(String[] args) {
        SpringApplication.run(myApplication.class, args);
    }
}
