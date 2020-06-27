package ÷≤ŒÔ¥Û’ΩΩ© ¨;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;

public class Bullet {
	int m,n;
	Graphics g;
	Image img1 = new ImageIcon("pvz_picture\\ProjectilePea.png").getImage();
	int x=0,y=0;
	
	Bullet(int m,int n,Graphics g){
		this.m = m;
		this.n = n;
		this.g = g;
		x = 350+(m+1)*115;
		y = 150+25+n*175;
	}
	
	public void drawBullet(Graphics bg){
		bg.drawImage(img1, x, y, 50, 50, null);
	}
	public void moveBullet(){
		x += 9;
	}
}
