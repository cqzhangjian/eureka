package org.zj.springcloud.eureka.server;

import java.util.Scanner;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MyEurekaServer {
	
	public static void main(String[] args) {
		System.out.println("输入服务端:");
		String  profiles = new Scanner(System.in).nextLine();
		new SpringApplicationBuilder(MyEurekaServer.class).profiles(profiles).run(args);
	}
}
