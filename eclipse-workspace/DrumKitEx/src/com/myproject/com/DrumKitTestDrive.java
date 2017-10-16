package com.myproject.com;

public class DrumKitTestDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DrumKit d = new DrumKit();
		d.playSnare();
		d.snare = false;
		d.playTophat();
		
		
		if(d.snare == true) {
			 d.playSnare();
		 }
			
	}

}
