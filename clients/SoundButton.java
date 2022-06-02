package clients;

import java.awt.Button;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JButton;

public class SoundButton implements ActionListener {
	private String sound;

	public SoundButton(String sd) {
		// TODO Auto-generated constructor stub
		sound = sd;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		try {
			File file = new File(sound);
			AudioInputStream stream = AudioSystem.getAudioInputStream(file);
			Clip c = AudioSystem.getClip();
			c.open(stream);
			c.start();
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}
}
