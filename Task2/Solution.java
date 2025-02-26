import java.util.Scanner;

class Solution {
    public int missingInteger(int[] nums) {
        if(nums.length==0)
        	return 1;
        int sum=0;
        for (int num : nums) {
            if (num > sum + 1) {
                return sum + 1; 
            }
            sum += num; 
        }
   
        return sum+1;
    }
    public static void main(String[] args){
        Solution sol=new Solution();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println(sol.missingInteger(a));
    }
}
