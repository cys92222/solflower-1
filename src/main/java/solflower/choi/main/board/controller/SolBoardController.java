package solflower.choi.main.board.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import solflower.choi.main.board.service.SolBoardService;



@Controller
public class SolBoardController {

	@Autowired
	SolBoardService solBoardService;
	
	@RequestMapping(value = "/sol/board")
	public String solyiBoard(Model m) {
		//글 읽어오기
		System.out.println("contr");
		List<String> list = solBoardService.findList();
		
		m.addAttribute("list", list);
		return "board/solyi_board";
	}
	
}
