package org.huggies.service;

import java.util.ArrayList;

import org.huggies.domain.BoardDTO;

public interface BoardService {
	// 게시판 글쓰기 설계
	public void write(BoardDTO board);
	// 게시판 목록 리스트 설계
	public ArrayList<BoardDTO> list();
	// 게시판 상세 페이지 설계
	public BoardDTO detail(BoardDTO board);
}
