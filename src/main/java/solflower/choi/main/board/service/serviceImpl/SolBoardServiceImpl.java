package solflower.choi.main.board.service.serviceImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import solflower.choi.main.board.mapper.SolBoardMapper;
import solflower.choi.main.board.service.SolBoardService;

@Service
public class SolBoardServiceImpl implements SolBoardService {

	@Autowired
	SolBoardMapper solBoardMapper;

	@Override
	public List<String> findList() {
		// TODO Auto-generated method stub
		System.out.println("serviceImpl");
		return solBoardMapper.findList();
	}


	
	
}
