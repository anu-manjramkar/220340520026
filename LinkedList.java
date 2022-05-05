import java.util.Scanner;
class LinkedList{
	Node head;
	static class Node{
		int data;
		Node next;
		Node(int d){
			data=d;
			next=null;
		}
	}
	void insert(int key){
		Node new_node=new Node(key);
		new_node.next=head;
		head=new_node;
		return;
	}
	void append(int key){
		Node new_node=new Node(key);
		if(head==null){
			head=new_node;
			return;
		}
		Node n=head;
		while(n.next!=null){
			n=n.next;
		}
		n.next=new_node;
		new_node.next=null;
		return;
	}
	void printreverse(Node n){
		if(n==null)
			return;
		printreverse(n.next);
		System.out.print(n.data+" ");
	}
	public static void main(String args[]){
		LinkedList l=new LinkedList();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		l.insert(m);
		for(int i=1;i<=n-1;i++){
			int k=sc.nextInt();
			l.append(k);
		}
		l.printreverse(l.head);
	}
}