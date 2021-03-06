package com.liyang.controller;


import java.util.Date;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.liyang.entity.LeeoJSONResult;
import com.liyang.entity.Resource;
import com.liyang.entity.User;


@RestController
public class HelloController {
	
//	@Value("${com.liyang.http}")
//	private String http;
	
	@Autowired
	private Resource resource;
	
	
	@RequestMapping("/hello")
	public String hello() {
		return "hello springboot~~~~~~";
	}
	
	@RequestMapping("/getUser")
	public User getUser() {
		User user = new User();
		user.setAge(18);
		user.setName("小黄");
		
		return user;
	}
	
	@RequestMapping("/getUserJson")
	public LeeoJSONResult getUserJson() {
		System.err.println(">>>>>>>>>>>>>>>>>>>>>");
		User user = new User();
		user.setAge(18);
		user.setName("小黄");
		user.setPassword("123456");
		user.setBrsd(new Date());
		user.setRemark("333");
		
		return LeeoJSONResult.ok(user);
	}
	
	@RequestMapping("/hot")
	public String hot() {
		return "hot~~~~~~~";
	}
	
//	@RequestMapping(value="/resource")
//	public String resource() {
//		return http;
//	}
	
	@RequestMapping("/getResource")
	public LeeoJSONResult getResource() {
		
		Resource bean =new Resource();
		BeanUtils.copyProperties(resource, bean);
		
		return LeeoJSONResult.ok(bean);
	}
	
}
