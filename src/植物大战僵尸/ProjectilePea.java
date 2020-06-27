package ÷≤ŒÔ¥Û’ΩΩ© ¨;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;

import javax.swing.ImageIcon;

public class ProjectilePea extends Bullet{
//	int m,n;
//	Graphics g;
	Image img1 = new ImageIcon("pvz_picture\\ProjectilePea.png").getImage();
//	int x=0,y=0;
	
	ProjectilePea(int m,int n,Graphics g){
		super(m,n,g);
	}
	
	public void drawBullet(Graphics bg){
		bg.drawImage(img1, x, y, 50, 50, null);
	}
//	public void moveBullet(){
//		x += 10;
//	}
//	public void cleanBullet(){
////		g.drawImage(img2, 0, 0, 1980, 1080, x, y, x+50, y+50, null);
////		g.drawImage(img1, x, y, 50, 50,bgcolor, null);
//		g.setColor(new Color(238,238,238));
//		g.fillOval(x+7, y+5, 40, 40);
//		
//	}
}
