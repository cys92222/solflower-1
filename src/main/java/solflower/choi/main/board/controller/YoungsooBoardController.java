package solflower.choi.main.board.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import solflower.choi.main.board.service.YoungsooBoardService;

@Controller
public class YoungsooBoardController {
	
	@Autowired
	YoungsooBoardService ybs;
	
//	게시물 리스트
	@RequestMapping("/youngsooBoardList")
	public String findBoardList(@RequestParam Map map, Model model) {
		model.addAttribute("boardList", ybs.findBoardList());
		return "/board/youngsooBoardList";
	}
	
//	게시물 등록페이지
	@RequestMapping("/youngsooBoardAddForm")
	public String addBoardForm() {
		return "/board/youngsooBoardAdd";
	}
	
//	게시물 등록
	@RequestMapping("/youngsooBoardAdd")
	public String addBoard(@RequestParam Map map) {
//		System.out.println(map);
		return "/board/youngsooBoardList";
	}
}
