
// Input : 1->2->3->4->5-> Null
// Output; 5->4->3->2->1-> Null



	 class Node{
	    int data;
	    Node next;
	    public Node(int data){
	    	this.data = data;
	    }

	 }//end of Node class
	
	

public class ImplementLinkedList {
	static Node head;

	
	public static void main(String args[]) {
		ImplementLinkedList l = new ImplementLinkedList();
		
		l.append(5);
		l.append(6);
		l.display();
		
		l.prepend(7);
		l.display();
		
		head = l.reverse(head); // Remember that this method will return new head not reverse linked list
		l.printreverseList(head);
		
		
	}

	 public void append(int data){
	    if(head==null){
	        head = new Node(data);  
	        return;
	}//end of if

	Node current = head;

	while(current.next != null){
  

	current = current.next;
	}//end of while
	current.next = new Node(data);
	
	}//end of append
	 
	 
	    public void display() {  
	        //Node current will point to head  
	        Node current = head;  
	        if(head == null) {  
	            System.out.println("List is empty");  
	            return;  
	        }  
	        while(current != null) {  
	            //Prints each node by incrementing pointer  
	            System.out.print(current.data + " ");  
	            current = current.next;  
	        }  
	        System.out.println();  
	    }//end of display  
	    
	    public void prepend(int data){
	        Node newHead = new Node(data);
	        newHead.next=head;
	        head = newHead;
	    }//end of prepand


	    public int countNodes(Node head){
	        int count=1;
	        Node current = head;

	        while(current.next!=null){
	        current = current.next;
	        count=+1;
	    }//

	    return count;

	    }// end of count node
	    
	    
	    
	    public void deleteFirst(Node head){     //Here no param needed since we are removing head
	    	//Add return type f you want to return value

	    	if(head==null)return;

	    	    if(head!=null){
	    	    head=head.next;
	    	    }
	    	}//end of delete first

	    
	    public void deleteWithValue(int data) {
	        if(head==null)return;

	        if(head.data ==data){
	        head=head.next; // if we want to delete head then just cut that and make next as head
	        return;
	        }
	        Node current = head;

	        while (current.next != null){
	        if(current.next.data == data) {
	        current.next = current.next.next;
	        return;
	        }//end of if
	    }//end of while
	        current = current.next;
	    }//end of deletewith


	    public Node reverse(Node node)    // remember that this method will return new head and not whole linked list
	    {
	        Node prev = null;
	        Node current = node;
	        Node next = null;

	        while (current != null) {
	            next = current.next;      // Here next go to actual next node
	            current.next = prev;     // here prev becomes next link that means flow change
	            prev = current;            // now that prev gets current value
	            current = next;           // and current gets next value that was initially set
	            }
	        node = prev;
	        return node;
	        }//end of reverse

	   public void printreverseList(Node node) 
	    { 
	        while (node != null) { 
	            System.out.print(node.data + " "); 
	            node = node.next; 
	        } 
	    } 
	
}//end of class
	


	
	


