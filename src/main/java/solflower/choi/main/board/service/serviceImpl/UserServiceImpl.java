package solflower.choi.main.board.service.serviceImpl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import solflower.choi.main.board.service.UserService;
import solflower.choi.main.mapper.board.UserMapper;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserMapper um;
	
//	로그인
	@Override
	public int login(Map map) {
		// TODO Auto-generated method stub
		int result = um.login(map);
		
		return result;
	}
	
//	로그인 성공후 USER_NO 설정을 위한 
	@Override
	public int getUserNo(Map map) {
		// TODO Auto-generated method stub
		int result = um.getUserNo(map);
		
		return result;
	}

}
