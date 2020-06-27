package ÷≤ŒÔ¥Û’ΩΩ© ¨;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;

public class ProjectileCactus extends Bullet{
	
	Image img1 = new ImageIcon("pvz_picture\\ProjectileCactus.png").getImage();
	
	ProjectileCactus(int m, int n, Graphics g) {
		super(m, n, g);
		// TODO Auto-generated constructor stub
	}
	
	public void drawBullet(Graphics bg){
		bg.drawImage(img1, x, y, 50, 40, null);
	}
}
