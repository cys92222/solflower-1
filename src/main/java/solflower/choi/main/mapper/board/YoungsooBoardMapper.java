package solflower.choi.main.mapper.board;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface YoungsooBoardMapper {
//	로그인
	int login(Map map);
	
//	로그인 성공후 USER_NO 설정을 위한 
	int getUserNo(Map map);
	
//	게시물 리스트
	List<Map> findBoardList();
}
