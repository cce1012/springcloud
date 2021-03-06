package com.cce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

import cn.cce.MyRule;

@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name="SPRINGCLOUD-DEPT",configuration=MyRule.class)		//自定义myrule
public class Consumer80 {
	public static void main(String[] args) {
		SpringApplication.run(Consumer80.class, args);
	}
}
