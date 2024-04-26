
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage; 
import java.awt.event.*; 
import java.util.ArrayList;

public class Game  extends JPanel implements Runnable, KeyListener{

	
	private BufferedImage back; 
	private int key; 
	private ArrayList <Brick> brickList;
	private ArrayList <Brick> groundList;
	private Player p;
	private boolean isOnGround;
	
	public Game() {
		new Thread(this).start();	
		this.addKeyListener(this);
		key =-1; 
		brickList= setBricks();
		groundList= setGround();
		p= new Player(300,150);
	
	}
	private ArrayList<Brick> setBricks() {
	    ArrayList<Brick> temp = new ArrayList<Brick>();
	    for (int b=0; b<1; b++) {
	    int y= 350;
	    int x= 0;
	    for (int i=0; i<2; i++) {
	        for(int j = 0; j < 6; j++) {
	            temp.add(new Brick(x, y));
	            x += 50; // Increase horizontal spacing
	        }
	        x+=186;
	    }
	      
	    }
	    for (int k=0; k<1; k++) {
		    int y= 150;
		    int x= 0;
		    for (int i=0; i<2; i++) {
		        for(int h = 0; h < 5; h++) {
		            temp.add(new Brick(x, y));
		            x += 50; // Increase horizontal spacing
		        }
		        x+=286;
		    }
		      
		    }
	    return temp;
	}
	private ArrayList<Brick> setGround() {
	    ArrayList<Brick> temp = new ArrayList<Brick>();
	    int y= 511;
	    int x= -8;
	    for (int b=0; b<16; b++) {
	            temp.add(new Brick(x, y));
	            x += 50; // Increase horizontal spacing
	        }
	      
	    return temp;
	}

	
	
	public void run()
	   {
	   	try
	   	{
	   		while(true)
	   		{
	   		   Thread.currentThread().sleep(5);
	            repaint();
	         }
	      }
	   		catch(Exception e)
	      {
	      }
	  	}
	

	
	
	
	public void paint(Graphics g){
		
		Graphics2D twoDgraph = (Graphics2D) g; 
		if( back ==null)
			back=(BufferedImage)( (createImage(getWidth(), getHeight()))); 
		

		Graphics g2d = back.createGraphics();
	
		g2d.clearRect(0,0,getSize().width, getSize().height);
		
		//start here
		for(Brick b: brickList) {
			g2d.drawImage(new ImageIcon(b.getPic()).getImage(),b.getX(), b.getY(), b.getW(), b.getH(),this);
		}
		for(Brick b: groundList) {
			g2d.drawImage(new ImageIcon(b.getPic()).getImage(),b.getX(), b.getY(), b.getW(), b.getH(),this);
		}
		g2d.drawImage(new ImageIcon(p.getPic()).getImage(),p.getX(), p.getY(), p.getW(), p.getH(),this);
		detectOffscreen();
		p.move();
		collision();
		//gravity();
		
		System.out.print(p.getY());
		
		
		twoDgraph.drawImage(back, null, 0, 0);

	}

	

	@Override
	public void keyTyped(KeyEvent e) {
	}





	@Override
	public void keyPressed(KeyEvent e) {
		key= e.getKeyCode();
		System.out.println(key);
		if (key==37) {
			p.setDx(-1);
		}
		if (key==39) {
			p.setDx(1);
		}
		if(key==38 && isOnGround) {
			isOnGround=false;
			p.setpA(-6);
		}
		if (key==40) {
			p.setpV(1);
		}
	}



	@Override
	public void keyReleased(KeyEvent e) {
		key= e.getKeyCode();
		if (key==37) {
			p.setDx(0);
		}
		if (key==39) {
			p.setDx(0);
		}
	}
	
	public void detectOffscreen() {
		if (p.getX()<-15) {
			p.setX(756);
		}	
		if (p.getX()>756) {
			p.setX(-15);
		}
	}
	
	public void gravity() {
		if (isOnGround) {
			p.setpA(0);
			p.setpV(0);
		}
		else
			p.setpA(0.1);

	}
	
	public void collision() {
		if (p.getY()>436) {
			p.setY(436);
			isOnGround=true;
		}
		if (p.getY()>275) {
			p.setY(275);
			isOnGround=true;
		}
	}

	
}
