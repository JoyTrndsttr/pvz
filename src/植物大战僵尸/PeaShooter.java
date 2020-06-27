package ÷≤ŒÔ¥Û’ΩΩ© ¨;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;

public class PeaShooter {
	
	int m,n;
	Graphics g;
	
	PeaShooter(int m,int n,Graphics g){
		this.m = m;
		this.n = n;
		this.g = g;
	}
	
	public void draw(Graphics g){
		Image img = new ImageIcon("pvz_picture\\peaShooter.png").getImage();
		g.drawImage(img, 350+n*115, 150+m*175, 130, 175, null);
	}
//	public void clean(Graphics g){
//		Image img = new ImageIcon("pvz_picture\\peaShooter_gray.png").getImage();
//		g.drawImage(img, 350+n*115, 150+m*175, 130, 175, null);
//	}
//	public void clean(Graphics g){
//		Image img = new ImageIcon("pvz_picture\\peaShooter_gray.png").getImage();
//		g.drawImage(img, 350+n*115, 150+m*175, 130, 175, null);
//		g.drawImage(img,350+n*115, 150+m*175, 350+n*115+130, 150+m*175+175, 0, 0, 1980, 1080,  null);
//	}
}
