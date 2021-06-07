package solflower.choi.main.board.service;

import java.util.List;
import java.util.Map;

public interface YoungsooBoardService {
//	로그인
	int login(Map map);
	
//	로그인 성공후 USER_NO 설정을 위한 
	int getUserNo(Map map);

//	게시물 리스트
	List<Map> findBoardList();
}
