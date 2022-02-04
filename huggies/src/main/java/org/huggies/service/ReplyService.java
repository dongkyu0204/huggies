package org.huggies.service;

import java.util.ArrayList;

import org.huggies.domain.ReplyDTO;

public interface ReplyService {
   // 댓글 쓰기 설계
   public int write(ReplyDTO rdto);
   // 댓글 목록 리스트 설계
   public ArrayList<ReplyDTO> list(int bno);
   // 댓글 수정 설계
   public ReplyDTO modify(int rno);
   // 댓글 update 설계
   public int update(ReplyDTO rdto);
   // 댓글 삭제 설계
   public int remove(ReplyDTO rdto);
}