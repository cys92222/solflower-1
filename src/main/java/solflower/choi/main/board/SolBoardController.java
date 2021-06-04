package solflower.choi.main.board;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SolBoardController {

	@RequestMapping(value = "/sol/board")
	public String solyiBoard() {
		return "board/solyi";
	}
	
}
