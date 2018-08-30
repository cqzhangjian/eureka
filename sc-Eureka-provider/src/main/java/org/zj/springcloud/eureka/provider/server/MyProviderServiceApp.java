package org.zj.springcloud.eureka.provider.server;

import java.util.Scanner;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MyProviderServiceApp {
	public static void main(String[] args) {
		System.out.println("请求输入服务提供者端口号:");
		String port = new Scanner(System.in).nextLine();
		new SpringApplicationBuilder(MyProviderServiceApp.class).properties("server.port=" + port).run(args);
	}
}
