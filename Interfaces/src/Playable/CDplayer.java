package Playable;

public class CDplayer implements Playable {
	public void play(){
		System.out.println("CD can play");
	}
	public void pause(){
		System.out.println("CD player song is paused");
	}
	public void stop(){
		System.out.println("Stop the music from the CD");
	}
}
