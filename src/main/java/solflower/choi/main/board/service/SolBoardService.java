package solflower.choi.main.board.service;

import java.util.List;
import java.util.Map;

public interface SolBoardService {
	public List<Map> findList();

	public List<Map> findCategory();

	public void insertCategory(Map insertCategory);

}
