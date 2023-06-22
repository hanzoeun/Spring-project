package com.example.board2.dto;

import java.sql.Date;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class ReplyDTO {
	private int num;
	private String name;
	private String content;
	private String created;
	
	
}
