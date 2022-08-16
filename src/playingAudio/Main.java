//Jesus loves you

package playingAudio;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Main {


	public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {

		Scanner scanner = new Scanner(System.in);
		File file = new File("Half_Light.wav");

		AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
		Clip clip = AudioSystem.getClip();
		clip.open(audioStream);

		String response = "";




		response = response.toUpperCase();

		while (!response.equals("Q")) {
			System.out.println("P = play, S = Stop, R = Reset, Q = Quit"); // while loop is needed to keep on revealing
																			// the message over and over again
			System.out.println("Enter your choice: ");
			response = scanner.next(); // without this the main thread will terminate thus not allowing the music
			// play
			response = response.toUpperCase();

			// switch statement
			switch (response) {
			case ("P"):
				clip.start(); // start
				break;
			case ("S"):
				clip.stop(); // stop
				break;
			case ("R"):
				clip.setMicrosecondPosition(0); // reset's audio to beginning
				break;

			case ("Q"):
				clip.close(); // reset's audio to beginning
				break;

			default:
				System.out.println("Not a valid Response");

			}

			System.out.println("Byeeeee!");

		}


	}

}
;