package solflower.choi.main;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SolBoardVo {

	String user_id;
	String name;
	String phone;
	String email;
	String birth_day;
	String delete_at;
	
	int user_no 		;     //회원번호
	int board_no 		;     //글번호
	String category_code;     //카테고리 코드
	String title 		;     //제목
	String content 		;     //내용
	String create_date 	;     //작성일자
	String modify_date 	;     //수정일자
	int is_delete      	;     //삭제여부
	int hits            ;     //조회수
	int recommend       ;     //추천수
	int is_notice     	;     //공지여부
	
	String category_name;
}
