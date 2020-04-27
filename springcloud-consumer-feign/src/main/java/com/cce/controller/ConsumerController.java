package com.cce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cce.entity.Dept;
import com.cce.service.DeptFeignClient;

@RestController
public class ConsumerController {

	@Autowired
	private DeptFeignClient dFeignClient;

	@RequestMapping(value = "/consumer/dept/add")
	public boolean add(Dept dept) {
		return dFeignClient.add(dept);
	}

	@RequestMapping(value = "/consumer/dept/get/{id}")
	public Dept get(@PathVariable("id") Long id) {
		return dFeignClient.get(id);
	}

	@RequestMapping(value = "/consumer/dept/list")
	public List<Dept> list() {
		return dFeignClient.list();
	}
	
}
