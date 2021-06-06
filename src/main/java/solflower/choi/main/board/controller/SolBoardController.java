package solflower.choi.main.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SolBoardController {

	@RequestMapping(value = "/sol/board")
	public String solyiBoard() {
		//글 읽어오기
		
		return "board/solyi";
	}
	
}
