package com.liyang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FreemarkerController {
	
	@RequestMapping("/")
	public String index(ModelMap map) {
		System.err.println("Freemarker>>>>>>>index");
		map.put("name", "老王");
		return "index";
	}
	
	
	@RequestMapping("/center")
	public String center() {
		System.err.println("Freemarker>>>>>>>center");
		return "center/center";
	}
	
}
