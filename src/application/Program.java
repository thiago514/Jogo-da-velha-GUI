package application;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Program{
	public static void main(String[] args) {
		UI ui = new UI();
		Button exit = ui.exit;
		exit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ui.dispose();
				
			}
		});
		
	}
}
