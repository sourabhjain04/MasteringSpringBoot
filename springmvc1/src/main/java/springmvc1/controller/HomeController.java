package springmvc1.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/home")
	public String home() {
		System.out.println("this is out confermation about Views");
		return "index";
	}
}
