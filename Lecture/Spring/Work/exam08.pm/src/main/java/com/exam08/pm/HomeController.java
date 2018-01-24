package com.exam08.pm;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
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
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	//http://localhost:8080/jstl/jstl11
	//http://localhost:8080/jstl/jstl11?val=0
	@RequestMapping(value = "/jstl/jstl11", method = RequestMethod.GET)
	public String jstl11( Model model ) {
				
		return "jstl11";   //   src / main/webapp/WEB-INF/viwes/jstl11.jsp
	}

	//http://localhost:8080/jstl/jstlforeach
	@RequestMapping(value = "/jstl/jstlforeach", method = RequestMethod.GET)
	public String jstlforeach( Model model ) {
		
		List<String> food = new ArrayList<>();
		food.add("순두부");
		food.add("된장");
		food.add("김치");
				
		model.addAttribute("array",food);
		return "jstlforeach";   //   src / main/webapp/WEB-INF/viwes/jstlforeach.jsp
	}
}
