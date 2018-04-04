package com.liyang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FreemarkerController {
	
	@RequestMapping("/")
	public String index(ModelMap map) {
		System.err.println("Freemarker>>>>>>>index");
		map.put("name", "2222");
		return "index";
	}
	
	
	@RequestMapping("/center")
	public String center() {
		System.err.println("Freemarker>>>>>>>center");
		return "center/center";
	}
	
}
