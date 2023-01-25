package com.brizlabs.assi14;




public class Linkedlist_uc1 <T> {
	
	class Node{
	    T data;
	    Node next;

	    Node(T data) {
	        this.data = data;
	        this.next = null;
	    }
	}
	  
	Node head = null;
	
	public void addNode( T data) {
		Node newnode = new Node(data);
		
		if(head == null) {    
			head = newnode;
	    }else {
	    	newnode.next = head;
	    	head = newnode;                
	    		        
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
		
		Linkedlist_uc1 linked_list = new Linkedlist_uc1();
	        
	        linked_list.addNode(70);
	        linked_list.addNode(30);
	        linked_list.addNode(56);
	        
	        linked_list.print();
	        
	    }
	    
	
}