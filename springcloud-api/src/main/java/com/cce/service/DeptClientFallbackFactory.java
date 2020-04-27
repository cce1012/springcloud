package com.cce.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.cce.entity.Dept;

import feign.hystrix.FallbackFactory;
@Component
public class DeptClientFallbackFactory implements FallbackFactory<DeptFeignClient>{

	@Override
	public DeptFeignClient create(Throwable arg0) {

		return new DeptFeignClient() {

			@Override
			public Dept get(Long id) {
				return new Dept().setDeptno(id).setDname("该ID:"+id+"没有对应的信息,Consumer客户端提供的降级信息,此刻服务Provider已经关闭")
						.setDb_source("no this database in MySQL");
			}

			@Override
			public List<Dept> list() {

				return null;
			}

			@Override
			public boolean add(Dept dept) {

				return false;
			}

		};
	}

}
