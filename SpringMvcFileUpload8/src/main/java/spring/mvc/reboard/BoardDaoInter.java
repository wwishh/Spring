package spring.mvc.reboard;

import java.util.List;

public interface BoardDaoInter {
	public int getTotalCount();
	public int getMaxNum();
	public void updateRestep(int regroup, int restep);
	public void insertReboard(BoardDto dto);
	public List<BoardDto> getPagingList(int start, int perpage);
	public BoardDto getDataReboard(int num);
	public void updateReadcount(int num);
	public int getCheckPass(int num, int pass);
	public void updateDetail(BoardDto dto);
	public void deleteDetail(int num);
}
