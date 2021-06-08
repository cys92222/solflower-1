package solflower.choi.main.mapper.board;

import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SolBoardMapper {
	
	List<Map> findList();
	
	List<Map> categoryList();

	void insertCategory(Map insertCategory);
}
