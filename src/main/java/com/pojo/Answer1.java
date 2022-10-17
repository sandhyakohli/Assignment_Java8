package com.pojo;

import java.util.Iterator;

public class Answer1 {
	private int a_ID;
	private String answer;
	private String a_by;
	public Answer1(int a_ID, String answer, String a_by) {
		super();
		this.a_ID = a_ID;
		this.answer = answer;
		this.a_by = a_by;
	}
	public Answer1() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Answer Selected:\n" + a_ID + ". " + answer + "\n Posted by" + a_by ;
	}

}
