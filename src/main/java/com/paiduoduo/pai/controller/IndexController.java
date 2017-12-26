package com.paiduoduo.pai.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	
	@RequestMapping("index")
    public String getLoginPage(ModelMap map){
        return "index";
    }
}
