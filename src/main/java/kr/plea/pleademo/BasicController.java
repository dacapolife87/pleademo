package kr.plea.pleademo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BasicController {
	Logger logger = LoggerFactory.getLogger(BasicController.class);
	
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String helloPage(Model model) {
		logger.debug("Requset helloPage!");
		model.addAttribute("title", "Spring Boot View Demo");
		return "hello";
	}
}
