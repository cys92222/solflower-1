package solflower.choi.main.board.service.serviceImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import solflower.choi.main.board.service.YoungsooBoardService;
import solflower.choi.main.mapper.board.YoungsooBoardMapper;


@Service
public class YongsooBoardServiceImpl implements YoungsooBoardService {

	@Autowired
	YoungsooBoardMapper ybm;
	
//	게시물 리스트
	@Override
	public List<Map> findBoardList() {
		// TODO Auto-generated method stub
		return ybm.findBoardList();
	}





}
