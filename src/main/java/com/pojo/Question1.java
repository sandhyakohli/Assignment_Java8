package com.pojo;

import java.util.Iterator;
import java.util.List;

public class Question1 {
private int q_ID;
private String q_name;
private List<Answer1> answer;
public Question1(int q_ID, String q_name, List<Answer1> answer) {
	super();
	this.q_ID = q_ID;
	this.q_name = q_name;
	this.answer = answer;
}
public Question1() {
	super();
	// TODO Auto-generated constructor stub
}


public void display() {
    System.out.println("Question: "+q_ID+"."+q_name);
    Iterator<Answer1> itr = answer.iterator();
    while (itr.hasNext()) {
        System.out.println(itr.next());
        
    }
}
}
