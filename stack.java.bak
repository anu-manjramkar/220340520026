class stack{
	int max=10;
	int a[]=new int[max];
	int Top1,Top2;
	stack(){
		Top1=-1;
		Top2=max;
	}
	void push1(int key){
		Top1++;
		a[Top1]=key;
	}
	void push2(int key){
		Top2--;
		a[Top2]=key;
	}
	int pop1(){
		int n=a[Top1];
		Top1--;
		return n;
	}
	int pop2(){
		int m=a[Top2];
		Top2++;
		return m;
	}
	public static void main(String args[]){
		stack s=new stack();
		s.push1(5);
		s.push2(10);
		s.push2(15);
		s.push1(11);
		s.push2(7);
		s.push2(40);
		System.out.println("Popped element from stack1 is "+s.pop1());
		System.out.println("Popped element from stack2 is "+s.pop2());
	}
}