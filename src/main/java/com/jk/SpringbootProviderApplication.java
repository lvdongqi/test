package com.jk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
// 使用 dubbo.xml 配置
@ImportResource(value = {"classpath:dubbo-provider.xml"})
public class SpringbootProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootProviderApplication.class, args);
	}
}
