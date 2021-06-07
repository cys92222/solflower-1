package solflower.choi.main.board.service;

import java.util.Map;

public interface UserService {
//	로그인
	int login(Map map);
	
//	로그인 성공후 USER_NO 설정을 위한 
	int getUserNo(Map map);
}
