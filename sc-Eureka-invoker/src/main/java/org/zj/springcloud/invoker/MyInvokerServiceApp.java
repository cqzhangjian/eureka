package org.zj.springcloud.invoker;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MyInvokerServiceApp {
	
	public static void main(String[] args) {
		new SpringApplicationBuilder(MyInvokerServiceApp.class).run(args);
	}

}
