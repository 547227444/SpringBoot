package com.liyang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FreemarkerController {
	
	@RequestMapping("/a")
	public String index(ModelMap map) {
		System.err.println(">>>>>>>>>>>>>>>>>>>>>");
		map.put("name", "隔壁老王");
		return "index";
	}
	
	
	@RequestMapping("/center")
	public String center() {
		return "center/center";
	}
	
}
