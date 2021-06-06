package solflower.choi.main.board.service.serviceImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import solflower.choi.main.SolBoardVo;
<<<<<<< HEAD
=======
import solflower.choi.main.board.mapper.SolBoardMapper;
>>>>>>> branch 'master' of https://github.com/choi-solyi/solflower.git
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


	
	
}
