package 植物大战僵尸;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.net.MalformedURLException;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

import java.applet.AudioClip;

public class ShowUI extends JFrame{
	
	//定义常量
	public final int w = 115;//width
	public final int h = 175;//height
	
	boolean[][] isFilled = new boolean[5][9];
	Image img[] = new Image[10];
	PvzMouseListener mouseListener;
	ArrayList pea = new ArrayList();
	
	public void paint(Graphics g){
		super.paint(g);
	
		for(int i=0;i<5;i++){
			for(int j=0;j<9;j++){
				isFilled[i][j] = false;
			}
		}
		
		img[0] = new ImageIcon("pvz_picture\\background2.jpg").getImage();
		img[1] = new ImageIcon("pvz_picture\\peaShooter.gif").getImage();
		img[2] = new ImageIcon("pvz_picture\\ProjectilePea.png").getImage();
		img[3] = new ImageIcon("pvz_picture\\xp.png").getImage();
		g.drawImage(img[0], 0, 0, 1980, 1080, null);
		
		g.drawImage(img[1], 350, 150, 130, 175, null);
		isFilled[0][0] = true;
		g.drawImage(img[1], 350+w, 150+h, 130, 175, null);
		isFilled[1][1] = true;
		g.drawImage(img[1], 350+2*w, 150+2*h, 130, 175, null);
		isFilled[2][2] = true;
		
		
		
//		g.drawImage(img[2], 750, 178, 50, 50, null);
//		g.drawImage(img[3], 1000, 138, 115, 175, null);
//		//这些是草坪网格的参考线
//		for(int y=0;y<6;y++){
//			g.drawLine(400, 150+175*y, 1385, 150+175*y);
//		}
//		for(int x=0;x<10;x++){
//			g.drawLine(350+x*115, 150, 350+x*115, 1025);	
//		}
	}
	public void InitUI(){
		
		this.setTitle("植物大战僵尸魔改版");
		this.setSize(1980, 1080);
		this.setResizable(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
		mouseListener = new PvzMouseListener(isFilled,img);
		this.addMouseListener(mouseListener);
		mouseListener.g = this.getGraphics();
		mouseListener.pea = pea;
		
		
		Thread t1= new Thread(mouseListener);
		t1.start();
		
		BulletRunnable bulletRunnable = new BulletRunnable(mouseListener.g,img,this);
		bulletRunnable.pea = pea;
		
		Thread t2= new Thread(bulletRunnable);
		t2.start();
		
		BgmRunnable bgm = new BgmRunnable();
		Thread t3 = new Thread(bgm);
		t3.start();
	}
	
	
	

	
	public static void main(String[] args) throws MalformedURLException {
		
		ShowUI UI = new ShowUI();
		UI.InitUI();

	}

}
