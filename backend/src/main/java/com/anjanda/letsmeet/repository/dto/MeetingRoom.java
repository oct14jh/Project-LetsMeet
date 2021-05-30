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

public class MeetingRoom {
	private int mrNo;
	private int mrSuperUNo;
	private String mrName;
	private String mrCategory;
	private String mrImage;
	private String mrDateStart;	 
	private String mrDateEnd;
	private String mrCenterLat;
	private String mrCenterLng;
	private String mrDate;
	private int mrUCnt;
	private int mrPlace;
	public int getMrNo() {
		return mrNo;
	}
	public void setMrNo(int mrNo) {
		this.mrNo = mrNo;
	}
	public int getMrSuperUNo() {
		return mrSuperUNo;
	}
	public void setMrSuperUNo(int mrSuperUNo) {
		this.mrSuperUNo = mrSuperUNo;
	}
	public String getMrName() {
		return mrName;
	}
	public void setMrName(String mrName) {
		this.mrName = mrName;
	}
	public String getMrCategory() {
		return mrCategory;
	}
	public void setMrCategory(String mrCategory) {
		this.mrCategory = mrCategory;
	}
	public String getMrImage() {
		return mrImage;
	}
	public void setMrImage(String mrImage) {
		this.mrImage = mrImage;
	}
	public String getMrDateStart() {
		return mrDateStart;
	}
	public void setMrDateStart(String mrDateStart) {
		this.mrDateStart = mrDateStart;
	}
	public String getMrDateEnd() {
		return mrDateEnd;
	}
	public void setMrDateEnd(String mrDateEnd) {
		this.mrDateEnd = mrDateEnd;
	}
	public String getMrCenterLat() {
		return mrCenterLat;
	}
	public void setMrCenterLat(String mrCenterLat) {
		this.mrCenterLat = mrCenterLat;
	}
	public String getMrCenterLng() {
		return mrCenterLng;
	}
	public void setMrCenterLng(String mrCenterLng) {
		this.mrCenterLng = mrCenterLng;
	}
	public String getMrDate() {
		return mrDate;
	}
	public void setMrDate(String mrDate) {
		this.mrDate = mrDate;
	}
	public int getMrUCnt() {
		return mrUCnt;
	}
	public void setMrUCnt(int mrUCnt) {
		this.mrUCnt = mrUCnt;
	}
	public int getMrPlace() {
		return mrPlace;
	}
	public void setMrPlace(int mrPlace) {
		this.mrPlace = mrPlace;
	}
	@Override
	public String toString() {
		return "MeetingRoom [mrNo=" + mrNo + ", mrSuperUNo=" + mrSuperUNo + ", mrName=" + mrName + ", mrCategory="
				+ mrCategory + ", mrImage=" + mrImage + ", mrDateStart=" + mrDateStart + ", mrDateEnd=" + mrDateEnd
				+ ", mrCenterLat=" + mrCenterLat + ", mrCenterLng=" + mrCenterLng + ", mrDate=" + mrDate + ", mrUCnt="
				+ mrUCnt + ", mrPlace=" + mrPlace + "]";
	}
	
	
}
