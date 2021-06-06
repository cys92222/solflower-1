package solflower.choi.main.board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import solflower.choi.main.board.service.YoungsooBoardService;

@Controller
public class YoungsoBoardController {

	@Autowired
	YoungsooBoardService ybs;
	
	@RequestMapping("/youngsooBoardList")
	public String findBoardList(Model model) {
		System.out.println("컨트롤러@@@@@@@@@@@@@@");
		model.addAttribute("boardList", ybs.findBoardList());
		return "/board/youngsoBoardList";
	}
}
