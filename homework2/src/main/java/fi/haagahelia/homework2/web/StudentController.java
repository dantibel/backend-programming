package fi.haagahelia.homework2.web;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import fi.haagahelia.homework2.domain.Student;

@Controller
public class StudentController {

    // note endpoint is '/hello-list'
    @RequestMapping(value = "/hello-list", method = RequestMethod.GET)
	public String helloList(Model model) {
        final List<Student> students = Arrays.asList(
            new Student("Kate", "Cole"), 
            new Student("Dan", "Brown"),
            new Student("Mike", "Mars") 
        );
		model.addAttribute("students", students);
		return "hello-list";
	}

}
