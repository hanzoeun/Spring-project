package com.example.board2.service;

import com.example.board2.dao.ReplyDao;

public class ReplyServiceImpl implements ReplyService {
		ReplyDao dao;
	
	
	
		//앞에 num 값을 해서 서로 값을 가져올생각 
	@Override
	public void getNum() throws Exception {
		dao.getNum();
	}

}
