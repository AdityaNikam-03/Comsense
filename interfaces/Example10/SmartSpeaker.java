package com.tbc.interfaces.Example10;

public class SmartSpeaker extends Device implements SmartDevice,VoiceAssistant{
	public void connectToWiFi() {
		System.out.println("Connect to WiFi.....!");
	}
	
	public void respondToVoice() {
		System.out.println("Respond to Voice.....!");
	}
}
