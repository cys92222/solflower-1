package solflower.choi.main.board.controller;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import solflower.choi.main.board.service.UserService;

@Controller
public class userController {
	@Autowired
	UserService us;
	
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
		int result = us.login(map);
		if(result > 0) {
			session.setAttribute("USER_NO", us.getUserNo(map));
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
}
