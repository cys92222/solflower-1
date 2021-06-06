package solflower.choi.main.board.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface YoungsoBoardMapper {
	
	List<Map> findBoardList();
}
