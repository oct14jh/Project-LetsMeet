package com.anjanda.letsmeet.repository.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 
 * @Date : 2021. 2. 5.
 * @Team : AnJanDa
 * @author : 김지현
 * @deploy : 김동빈
 * @Project : 레쓰밋 :: backend
 * @Function : 찜 가게 VO 클래스
 * @Description
 *
 */

@ToString
public class LikeStore {
	private int lsUNo;
	private int lsSNo;
	public LikeStore() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LikeStore(int lsUNo, int lsSNo) {
		super();
		this.lsUNo = lsUNo;
		this.lsSNo = lsSNo;
	}
	public int getLsUNo() {
		return lsUNo;
	}
	public void setLsUNo(int lsUNo) {
		this.lsUNo = lsUNo;
	}
	public int getLsSNo() {
		return lsSNo;
	}
	public void setLsSNo(int lsSNo) {
		this.lsSNo = lsSNo;
	}
	
	
	
}
