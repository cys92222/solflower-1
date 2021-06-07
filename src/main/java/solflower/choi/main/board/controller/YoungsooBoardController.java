package solflower.choi.main.board.controller;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import solflower.choi.main.board.service.YoungsooBoardService;

@Controller
public class YoungsooBoardController {

	@Autowired
	YoungsooBoardService ybs;
	
//	로그인 페이지
	@RequestMapping("/loginForm")
	public String loginForm(Model model) {
		model.addAttribute("msg", "test");
		return "/login/loginForm";
	}
	
//	로그인
	@RequestMapping("/login")
	public String login(@RequestParam Map map, HttpSession session, Model model) {
//		System.out.println(map);
//		System.out.println(map.get("USER_ID"));
		int result = ybs.login(map);
		if(result > 0) {
			session.setAttribute("USER_NO", ybs.getUserNo(map));
			session.setAttribute("USER_ID", map.get("USER_ID"));
			return "/board/youngsooBoardList";
		}else {
			model.addAttribute("msg", "로그인 정보를 확인해주세요");
			return "/login/loginForm";
		}
	}
	
//	로그아웃
	@RequestMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "/board/youngsooBoardList";
	}
	
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
