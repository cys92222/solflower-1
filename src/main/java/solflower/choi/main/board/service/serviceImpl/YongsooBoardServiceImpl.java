package solflower.choi.main.board.service.serviceImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import solflower.choi.main.board.mapper.YoungsoBoardMapper;
import solflower.choi.main.board.service.YoungsooBoardService;


@Service
public class YongsooBoardServiceImpl implements YoungsooBoardService {

	@Autowired
	YoungsoBoardMapper ybm;
	
	@Override
	public List<Map> findBoardList() {
		System.out.println("서비스임플@@@@@");
		return ybm.findBoardList();
	}

}