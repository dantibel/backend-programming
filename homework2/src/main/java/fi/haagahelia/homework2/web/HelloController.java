package fi.haagahelia.homework2.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class HelloController {

    // note endpoint is '/hello-age'
	@RequestMapping(value = "/hello-age", method = RequestMethod.GET)
	public String helloAge(@RequestParam(name="name") String name, @RequestParam(name="age") String age, Model model) {
		model.addAttribute("name", name);
		model.addAttribute("age", age);
		return "hello-age";
	}

}