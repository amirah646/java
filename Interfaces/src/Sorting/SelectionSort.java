package Sorting;

public class SelectionSort implements Sortable{
	public void sort(int[] nums){
		for(int i=0;i<nums.length-1;i++){
			int minindex=i;
			for(int j=i+1;j<nums.length;j++){
				if(nums[j]<nums[minindex]){
					minindex=j;	
					}
				}
			if(minindex!=i){
				int temp=nums[i];
				nums[i]=nums[minindex];
				nums[minindex]=temp;
			}
		}
	}
}
