package SortingDemo;

public class BubbleSort {
	
	public static void display(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static void main(String args[]) {
		int arr[]= {21,7,8,2,1,3,10};
		
		//Bubble sort
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					//swap
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
			
		}
		display(arr);
	
	}

}
