package Arrays;

import java.util.Scanner;

public class BirdWatcher {
	int[] birdsPerDay;
	public BirdWatcher(int[] birdsPerDay){
		this.birdsPerDay = birdsPerDay;
	}
	
	public void getLastWeek(){
		System.out.print("LastWeek : ");
		for(int i=0;i<birdsPerDay.length;i++){
			System.out.print(birdsPerDay[i]+" ");
		}
		System.out.println();
	}
	
	public void getToday(int todayIndex){
		System.out.println("Today Count : " + birdsPerDay[todayIndex]);
	}
	
	public void incrementTodaysCount(int todayIndex){
		birdsPerDay[todayIndex] = birdsPerDay[todayIndex]+1;
		System.out.println("Incremented Todays Count:"+birdsPerDay[todayIndex]);
	}
	
	public void hasDayWithoutBirds(){
		for(int i=0;i<birdsPerDay.length;i++){
			if(i==0){
				System.out.println(true);
				return;
			}
			else{
				System.out.println(false);
			}
		}
	}
	
	public void getCountForFirstDays(int days){
		int sum=0;
		for(int i=0;i<days;i++){
			sum+=birdsPerDay[i];
		}
		System.out.println(sum);
	}
	public void getBusyDays(){
		int count=0;
		for(int i=0;i<birdsPerDay.length;i++){
			if(birdsPerDay[i]>=5){
				count++;
			}
		}
		System.out.println(count);
	}
	
	public static void main(String[] args) {
		int[] birdsPerDay = { 0, 2, 5, 3, 7, 8, 4};
		BirdWatcher bw=new BirdWatcher(birdsPerDay);
		bw.getLastWeek();
		bw.getToday(3);
		bw.incrementTodaysCount(3);
		bw.hasDayWithoutBirds();
		bw.getCountForFirstDays(4);
		bw.getBusyDays();
	}

}
