/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kamus;


public class Queue {
    Data front,rear;
    boolean isEmpty(){
		
		return (front == null);
	}
	
	public void insert(String kata ,String makna){
		
		Data newData = new Data();
		newData.kata = kata;
		newData.makna = makna;
		
		if(isEmpty()){
			
			front = newData;		
		}
		
		else 
			
		    rear.next = newData;
			rear = newData;
			
	}

    
    
}
