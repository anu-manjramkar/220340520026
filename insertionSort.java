import java.util.Scanner;
class insertionSort{
	void insertionsort(int a1[],int n){
		for(int i=1;i<n;i++){
			int k=a1[i];
			int j=i-1;
			while(j>=0&&a1[j]>k){
				a1[j+1]=a1[j];
				j=j-1;
			}
			a1[j+1]=k;
			System.out.println();
			insertionSort.printarray(a1,n);
		}
	}
	static void printarray(int a1[],int n){
		for(int i=0;i<n;i++){
			System.out.print(a1[i]+" ");
		}
		System.out.println();
		return;
	}
	
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	insertionSort i1=new insertionSort();
		int max=0;
		max=sc.nextInt();
		int a1[]=new int[max];
		for(int i=0;i<max;i++){
			a1[i]=sc.nextInt();
		}
		int n=max;
		i1.insertionsort(a1,n);
	}	

}