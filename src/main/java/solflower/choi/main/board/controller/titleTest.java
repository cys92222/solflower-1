package solflower.choi.main.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class titleTest {
	
	@GetMapping(value = {"", "index"})
    public ModelAndView index() {

        ModelAndView mv = new ModelAndView();
        
        mv.setViewName("main/index");
//        mv.setViewName("board/youngsooBoardList");
        return mv;
    }
}
