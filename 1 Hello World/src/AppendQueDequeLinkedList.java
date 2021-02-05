
class QNode { 
    int key; 
    QNode next; 
  
    /* To understand this code, refer to youtube vide of CS Dojo
     * Above, when you create linkedlist class - it automatically has next data type as Qnode.
     * So in short, next above is data with type Qnode (Linked list)
     * below, constructor to create a new linked list node
     *  this.key = key is obvious as whenever 
     *  we call this class, we provide value and it will populate that box with that value
     *  Now, we also always need to define this.next=null as linked list need to create next box 
     *  so that whenever called next time, that is the one to be populated
     */
    public QNode(int key) 
    { 
        this.key = key; 
        this.next = null; 
    } 
} 


//Another class
public class AppendQueDequeLinkedList {
	QNode front, rear;
	
	//constructor
	public AppendQueDequeLinkedList()
    {
        this.front = this.rear = null;
    }
	
	
	//enQueue() This operation adds a new node after rear and moves rear to the next node
	void enqueue(int key)  // This is simply normal append method above
    {
        // Create a new LL node
        QNode temp = new QNode(key);
 
        // If queue is empty, then new node is front and rear both
        if (this.rear == null) {
            this.front = this.rear = temp;
            return;
        } 
        // Add the new node at the end of queue and change rear
        this.rear.next = temp; // add temp to next data node
        this.rear = temp; //now make next node as current by this.current
    }

	
	 // Method to remove an key from queue.
    void dequeue()
    {
        // If queue is empty, return NULL.
        if (this.front == null)
            return;
  
        // Store previous front and move front one node ahead
        QNode temp = this.front;
        this.front = this.front.next;
  
        // If front becomes NULL, then change rear also as NULL
        if (this.front == null)
            this.rear = null;
    }

    public static void main(String[] args) 
    { 
    	AppendQueDequeLinkedList q = new AppendQueDequeLinkedList();
        q.enqueue(10); 
        q.enqueue(20); 
        q.dequeue(); 
        q.dequeue(); 
        q.enqueue(30); 
        q.enqueue(40); 
        q.enqueue(50); 
        q.dequeue(); 
        System.out.println("Queue Front : " + q.front.key); 
        System.out.println("Queue Rear : " + q.rear.key); 
    } 	
	
}//end of class




