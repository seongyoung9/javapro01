package com.spring51.jstl;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class jstlController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	 @RequestMapping(value = "/jstl/jstl01", method = RequestMethod.GET)
	 public String jstl01(Model model) {
	 logger.info("jstl01");

	 return "jstl/jstl01";  //--> views / jslt / jslt01
	 }
	 
	 @RequestMapping(value = "/jstl/jstl02", method = RequestMethod.GET)
	 public String jstl02(Model model) {
	 logger.info("jstl02");

	 int num1 = 7;
	 int num2 = 9;
	 //model.addAttribute를 사용하여 자바코드 변수를 jsp파일로 넘긴다.
	 model.addAttribute("num1", num1);
	 model.addAttribute("num2", num2);

	 return "jstl/jstl02";
	 }
	
}

