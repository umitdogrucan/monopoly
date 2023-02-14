package monopoly;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;

public  class GamePanel extends JPanel implements ActionListener{

	static final int SCREEN_WIDTH = 1300;
	static final int SCREEN_HEIGHT = 650;
	Random random;
	
	GamePanel() throws InterruptedException {
		random = new Random();
		this.setPreferredSize (new Dimension(SCREEN_WIDTH,SCREEN_HEIGHT));
		this.setBackground(Color.black);
		this.setFocusable(true);
	
		Player player = new Player();
		player.play();
	}
	
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		draw(g);
	}
	public void draw(Graphics g) {
		
		
			g.setColor(Color.red);
			g.setFont( new Font("Ink Free",Font.BOLD, 40));
			FontMetrics metrics = getFontMetrics(g.getFont());
			g.drawString("Score: "+"20", (SCREEN_WIDTH - metrics.stringWidth("Score: "+"20"))/2, g.getFont().getSize());
		}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
		
	
	
	

	

}