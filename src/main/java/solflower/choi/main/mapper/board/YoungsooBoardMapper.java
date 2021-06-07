package solflower.choi.main.mapper.board;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface YoungsooBoardMapper {
	
//	게시물 리스트
	List<Map> findBoardList();
}
