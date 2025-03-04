package com.hw0.model.dto;

import java.util.List;

public class IdolDebut {

	
	private String group; //그룹
	private int debutyear;	//데뷔 년도 
	private String title; //노래 제목
	private List<String> member; //멤버 (리스트 생성)
	
	public IdolDebut() {}

	public IdolDebut(String group, int debutyear, String title, List<String> member) {
		super();
		this.group = group;
		this.debutyear = debutyear;
		this.title = title;
		this.member = member;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public int getDebutyear() {
		return debutyear;
	}

	public void setDebutyear(int debutyear) {
		this.debutyear = debutyear;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<String> getMember() {
		return member;
	}

	public void setMember(List<String> member) {
		this.member = member;
	}
	
	@Override
	public String toString() {
		return " 그룹명 : " + group + 
				" 데뷔년도 : " + debutyear + 
				" 타이틀명 : " + title +
				" 멤버 : " + member ; 
	}
}