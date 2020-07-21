package org.zerock.mapper;

import java.util.List;

import org.zerock.domain.BoardVo;

public interface BoardMapper {

	public List<BoardVo>list();
	
	public void insert(BoardVo boardVo);
	
	public BoardVo get(Long bno);
	
	public int delete(Long bno);
	
	public int update(BoardVo boardVo);
}
