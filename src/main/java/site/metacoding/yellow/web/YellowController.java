package site.metacoding.yellow.web;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class YellowController {

	@GetMapping("/yellow")
	public String yellow() {
		return "index";
	}
}
