package solflower.choi.main.board.service.serviceImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import solflower.choi.main.SolBoardVo;
import solflower.choi.main.board.service.SolBoardService;
import solflower.choi.main.mapper.board.SolBoardMapper;

@Service
public class SolBoardServiceImpl implements SolBoardService {

	@Autowired
	SolBoardMapper solBoardMapper;

	@Override
	public List<Map> findList() {
		return solBoardMapper.findList();
	}

	@Override
	public List<Map> findCategory() {
		return solBoardMapper.categoryList();
	}

	@Override
	public void insertCategory(Map insertCategory) {
		solBoardMapper.insertCategory(insertCategory);
	}
	
	
}
