package Playable;

import java.util.Scanner;

public class MainPlayable {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Playable player=null;
		System.out.println("Choose 1.Mp3, 2.CD, 3.StreamingPlayer to play");
		int option=sc.nextInt();
		
			switch(option){
				case 1:
					player=new MP3player();
					break;
				case 2:
					player=new MP3player();
					break;
				case 3:
					player=new MP3player();
					break;
				default:
					System.out.println("No such player is available");
					System.exit(0);
			}
			player.play();
			player.pause();
			player.stop();
		}
}
