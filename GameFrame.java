package monopoly;

import javax.swing.JFrame;

public class GameFrame extends JFrame{

	GameFrame() throws InterruptedException{
			
		this.add(new GamePanel());
		this.setTitle("Monopoly");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		
	}
}