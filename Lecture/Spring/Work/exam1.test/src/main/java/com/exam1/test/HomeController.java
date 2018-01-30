package com.exam1.test;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	IServicePhone svr;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	@RequestMapping(value = "/phone/writeone", method = RequestMethod.GET)
	public String writeone(Model model) {
		
		
		return "writeOneForm";
	}
	@RequestMapping(value = "/phone/writeone", method = RequestMethod.POST)
	public String writeone( Model model 
							, @RequestParam String  name
							, @RequestParam String  manufacturer
							, @RequestParam Integer price       ) {
		
		ModelPhone phone = new ModelPhone( name , manufacturer , price );
		
		svr.insertPhone( phone );
		
		List<ModelPhone> result = svr.getPhoneList();
		
		model.addAttribute("phone",result);
		
		return "writeOneResult";  // -->  src/main/webapp/WEP-INF/views/writelistresult.jsp
	}
	
	@RequestMapping(value = "/phone/writeonelist", method = RequestMethod.GET)
	public String writeonelist(Model model) {
		
		List<ModelPhone> result = svr.getPhoneList();
		
		model.addAttribute("phone",result);
		
		
		return "writeOneResult";
	}
	
}
