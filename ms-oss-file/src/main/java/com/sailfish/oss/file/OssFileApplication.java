package com.sailfish.oss.file;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author XIAXINYU3
 * @date 2020/11/17
 */
@SpringBootApplication
public class OssFileApplication {
    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(OssFileApplication.class);
        springApplication.run(args);
    }
}
