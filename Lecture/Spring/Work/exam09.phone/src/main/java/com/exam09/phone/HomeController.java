package com.exam09.phone;

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
	IServicePhone service;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home( Model model ) {
		logger.info("Welcome home! The client locale is {}.");
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	@RequestMapping(value = "/phone/writeone", method = RequestMethod.GET)
	public String writeone( Model model ) {
		
		logger.info("/phone/writeone");
		
		return "writeone";    /*  src/main/webapp/WEP-INF/views/writeone.jsp  */
	}

	
	@RequestMapping(value = "/phone/writeone", method = RequestMethod.POST)
	public String writeone( Model model 
							, @RequestParam String  name
							, @RequestParam String  manufacturer
							, @RequestParam Integer price       ) {
		
		ModelPhone phone = new ModelPhone( name , manufacturer , price );
		
		// DB table insert
		int result = service.insertPhone( phone );
		// DB table select
		List<ModelPhone> result2 = service.getPhoneList();
		
		model.addAttribute( "list" , result2);
		
		return "writelistresult";  // -->  src/main/webapp/WEP-INF/views/writelistresult.jsp
	}
	
	@RequestMapping(value = "/phone/writeoneresult", method = RequestMethod.GET)
	public String writelistresult( Model model ) {
		
		List<ModelPhone> result = service.getPhoneList();  // 데이터를 가져오고
		
		model.addAttribute( "list" , result );             // 데이터를 저장해주고
		
		return "writelistresult";    /*  src/main/webapp/WEP-INF/views/writeone.jsp  */     // 데이터를 보여준다
	}
	
}
