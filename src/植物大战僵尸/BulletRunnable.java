package ÷≤ŒÔ¥Û’ΩΩ© ¨;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

import javax.swing.ImageIcon;



public class BulletRunnable implements Runnable{
	
	Graphics g;
	ArrayList pea;
	ShowUI showUI;
	
	Image[] img;
	
	BulletRunnable(Graphics g,Image[] img,ShowUI showUI){
		this.g = g;
		this.img = img;
		this.showUI = showUI;
	}
	
	@Override
	public void run() {
		
		
		BufferedImage bfimg = new BufferedImage(showUI.getWidth(), showUI.getHeight(),BufferedImage.TYPE_INT_ARGB);
		Graphics bg = bfimg.getGraphics();
		
		while(true){
			
			try{
				Thread.sleep(10);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
			if(pea!=null){
				
				bg.drawImage(img[0], 0, 0,1980,1080,showUI);
				
				bg.drawImage(img[1], 350, 150, 130, 175, null);		
				bg.drawImage(img[1], 350+115, 150+175, 130, 175, null);		
				bg.drawImage(img[1], 350+230, 150+350, 130, 175, null);
				
				for(int i=0;i<pea.size();i++){
				
					((Bullet) pea.get(i)).moveBullet();
					((Bullet) pea.get(i)).drawBullet(bg);
								
				}
				g.drawImage(bfimg, 0, 0, showUI);
			    
			}
		
		}
	}

}
