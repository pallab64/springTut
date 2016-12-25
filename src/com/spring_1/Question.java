package com.spring_1;





public class Question {
 
	private int id;
	private String name;

	private Answer answer;//Aggregation  
	
	public Question(){
		
	}
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}

	public Answer getAnswer() {
		return answer;
	}



	public void setAnswer(Answer answer) {
		this.answer = answer;
	}



	

	
	void show(){  
	    System.out.println("A  is func");  
	   
	   answer.print();
	    
	}  

	
	
}
