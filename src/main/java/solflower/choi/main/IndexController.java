package solflower.choi.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	@RequestMapping(value = "/index")
	public String index() {
		System.out.println("aaa");
		return "index";
	}
	

	@RequestMapping(value = "/index2")
	public String index2() {
		return "index2";
	}
	
	@RequestMapping(value = "/index3")
	public String index3() {
		return "index2";
	}
	
	@RequestMapping(value = "/index4")
	public String index4() {
		return "index4";
		
	}
	

	@RequestMapping(value = "/sol")
	public String solyi() {
		return "portfolio/solyi";
		
	}
	
	
}
