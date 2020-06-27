package 植物大战僵尸;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class PvzMouseListener implements MouseListener,Runnable{
	
	ArrayList pea;
	boolean isFilled[][];
	Image img[];
	PvzMouseListener(boolean[][] isFilled,Image[] img){
		this.isFilled = isFilled;
		this.img      = img;
	}
	
	Graphics g;
	boolean isSelected = false;
	PeaShooter p;
	
	int m=0;//m代表行
	int n=0;//n代表列
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
//		n = (e.getX()-350)/115;
//		m = (e.getY()-150)/175;
//		if(m<0||m>4||n<0||n>8) return;
//		System.out.println(m+" "+n);
//		if(isFilled[m][n]){
//			isSelected = true;
//		}
//		if(isSelected){
//			p = new PeaShooter(m,n,g);
////			p.clean(g);
//			isFilled[m][n] = false;
//		}
//		System.out.println("鼠标在压着");
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
//		System.out.println("鼠标释放了");
//		if(isSelected||isFilled[m][n]){
//
//			m = (e.getY()-150)/175;
//			p = new PeaShooter(m,n,g);
//			p.draw(g);
//			isFilled[m][n] = true;
//		}
//		isSelected = false;
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		//对每个被植物覆盖的区域产生子弹
		while(true){
			try{
				Thread.sleep(200);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
			if(pea!=null){
				for(int m=0;m<5;m++){
					for(int n=0;n<3;n++){
						if(isFilled[m][n]){
							int flag = (int) (Math.random()*10);
							Bullet bullet = new Bullet(m,n,g);
							if(flag<3){
								bullet = new ProjectilePea(m,n,g);
							}
							else if(flag<5){
								bullet = new ProjectileSnowPea(m,n,g);
							}
							else if(flag<7){
								bullet = new Projectile_star(m,n,g);
							}
							else{
								bullet = new ProjectileCactus(m,n,g);
							}
							pea.add(bullet);
							System.out.println(flag);
						}
					}
				}
			}	
		}
	}
}
