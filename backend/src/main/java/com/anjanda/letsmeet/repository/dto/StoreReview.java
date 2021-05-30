package com.anjanda.letsmeet.repository.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 
 * @Date : 2021. 2. 5.
 * @Team : AnJanDa
 * @author : 김동빈, 김지현, 임호빈
 * @deploy : 김동빈
 * @Project : 레쓰밋 :: backend
 * @Function : 데이터 VO 클래스
 * @Description
 *	- 롬복 사용해서 getter, setter 사용함 (그래서 아래 메소드들 필요없음)
 */

@Getter
@Setter
@ToString
public class StoreReview {
	private int srNo;
	private int srSNo;
	private int srUNo;
	private String srContent;
	private int srScore;
	private String srTime;
	private String srImg;
	private String srUName;
	
	public StoreReview() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StoreReview(int srNo, int srSNo, int srUNo, String srContent, int srScore, String srTime, String srImg, String srUName) {
		super();
		this.srNo = srNo;
		this.srSNo = srSNo;
		this.srUNo = srUNo;
		this.srContent = srContent;
		this.srScore = srScore;
		this.srTime = srTime;
		this.srImg = srImg;
		this.srUName = srUName;
	}
	public int getSrNo() {
		return srNo;
	}
	public void setSrNo(int srNo) {
		this.srNo = srNo;
	}
	public int getSrSNo() {
		return srSNo;
	}
	public void setSrSNo(int srSNo) {
		this.srSNo = srSNo;
	}
	public int getSrUNo() {
		return srUNo;
	}
	public void setSrUNo(int srUNo) {
		this.srUNo = srUNo;
	}
	public String getSrContent() {
		return srContent;
	}
	public void setSrContent(String srContent) {
		this.srContent = srContent;
	}
	public int getSrScore() {
		return srScore;
	}
	public void setSrScore(int srScore) {
		this.srScore = srScore;
	}
	public String getSrTime() {
		return srTime;
	}
	public void setSrTime(String srTime) {
		this.srTime = srTime;
	}
	public String getSrImg() {
		return srImg;
	}
	public void setSrImg(String srImg) {
		this.srImg = srImg;
	}
	public String getSrUName() {
		return srUName;
	}
	public void setSrUName(String srUName) {
		this.srUName = srUName;
	}
	
	
	
}
