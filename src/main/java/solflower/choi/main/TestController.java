package solflower.choi.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

	@RequestMapping(value = "/test")
	public String index() {
		return "test";
	}
}
