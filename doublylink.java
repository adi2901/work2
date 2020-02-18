class Node{
	int data;
	Node prev;
	Node next;
	public Node(int data){
	this.data=data;
	}
}
	Node head,tail=null;
	public void addNote(int data){
	Node newNode=new Node(data);
	if(head==null){
	head=tail=newNode;
	head.previous=null;
	tail.next=null;
	}
	else{
	tail.next=newNode;
	newNode.previous=tail;
	tail=newNode;
	tail.next=null;
	}
}
	public void display(){
		Node current=head;
		if(head==null){
		System.out.println("List is empty");
		return;
		}
		System.out.println("Nodes of doubly linked list:");
		while(current!=null){
		System.out.println  System.out.print(current.data + " ");  
            current = current.next;  
        }  
    }  
  
    public static void main(String[] args) {  
  
        DoublyLinkedList dList = new DoublyLinkedList();  
        //Add nodes to the list  
        dList.addNode(1);  
        dList.addNode(2);  
        dList.addNode(3);  
        dList.addNode(4);  
        dList.addNode(5);  
  
        //Displays the nodes present in the list  
        dList.display();  
    }  
}  }