package com.hikvision;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author wsl
 * @Description:
 * @date 2021/12/6/17:03
 */

@SpringBootApplication(scanBasePackages = "com.hikvision")
public class ArthasApplication {
    public static void main(String[] args) {
        SpringApplication.run(ArthasApplication.class);
    }
}
