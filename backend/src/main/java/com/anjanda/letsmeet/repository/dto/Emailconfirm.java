package com.anjanda.letsmeet.repository.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Emailconfirm {
	private int eNo;
	private String eEmail;
	private String eConfirm;
	public int geteNo() {
		return eNo;
	}
	public void seteNo(int eNo) {
		this.eNo = eNo;
	}
	public String geteEmail() {
		return eEmail;
	}
	public void seteEmail(String eEmail) {
		this.eEmail = eEmail;
	}
	public String geteConfirm() {
		return eConfirm;
	}
	public void seteConfirm(String eConfirm) {
		this.eConfirm = eConfirm;
	}
}
