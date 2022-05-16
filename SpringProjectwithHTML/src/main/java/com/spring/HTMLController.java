package com.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HTMLController {
@RequestMapping(value="/helloworld",method=RequestMethod.GET)
public String helloworld() {
	//the html file name is helloworldpage.html
	return "spring";
}
}
