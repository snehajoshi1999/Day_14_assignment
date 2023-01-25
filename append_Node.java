package com.brizlabs.assi14;



public class append_Node<T>{

	class Node{
	    T data;
	    Node next;

	    Node(T data) {
	        this.data = data;
	        this.next = null;
	    }
	}
	  
	Node head = null;
	
	public void appending (T data) {
		
		if(head == null) {    
			head = new Node(data);
	    }else {
	    	Node current = head;
	    	while(current.next != null) {
	    		current = current.next;    
	    	}	            
	    	current.next = new Node(data);	        
	    }	    
	}
	    
	public void print() {	        
		Node curr_node = head;	        
		while(curr_node != null){	    
			System.out.print( curr_node.data + " ---> ");
			curr_node = curr_node.next;

		}
		System.out.println(" null");
		  
	}
	
	public static void main(String[] args) {
	        
		append_Node append = new append_Node();
	        
	        
		append.appending(56);	        
		append.appending(30);	       
		append.appending(70);
		
		append.print();	        
	    
	}
}