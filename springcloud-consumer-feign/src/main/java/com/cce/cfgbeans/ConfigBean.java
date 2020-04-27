package com.cce.cfgbeans;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RetryRule;
import com.netflix.loadbalancer.RoundRobinRule;

@Configuration
public class ConfigBean {	//boot -->spring   applicationContext.xml --- @Configuration配置   ConfigBean = applicationContext.xml
	@Bean
	@LoadBalanced
	public RestTemplate geRestTemplate(){
		return new RestTemplate();
	}
	
	@Bean
	public IRule mRule(){
		//return new RoundRobinRule();默认轮询
		return new RandomRule();//随机
		//return new RetryRule();//重试
	}
}
