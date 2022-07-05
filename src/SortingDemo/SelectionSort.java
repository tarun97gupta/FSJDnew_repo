package SortingDemo;

public class SelectionSort {

	public static void display(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static void main(String args[]) {
		int arr[]= {21,7,8,2,1,3,10};
		
		//Selection
		for(int i=0;i<arr.length-1;i++) {
			int smallest=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[smallest]>arr[j]) {
					smallest=j;
				}
			}
			int temp=arr[i];
			arr[i]=arr[smallest];
			arr[smallest]=temp;
		}
		display(arr);
			
	}
}
	


