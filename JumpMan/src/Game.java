
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage; 
import java.awt.event.*; 
import java.util.ArrayList;

public class Game  extends JPanel implements Runnable, KeyListener{

	
	private BufferedImage back; 
	private int key; 
	private ArrayList <Brick> brickList;
	
	public Game() {
		new Thread(this).start();	
		this.addKeyListener(this);
		key =-1; 
		brickList= setBricks();
	
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
	        x+=184;
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
		        x+=284;
		    }
		      
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
		
		twoDgraph.drawImage(back, null, 0, 0);

	}

	

	@Override
	public void keyTyped(KeyEvent e) {
	}





	@Override
	public void keyPressed(KeyEvent e) {
		key= e.getKeyCode();
		System.out.println(key);
		
		
		
	
	}



	@Override
	public void keyReleased(KeyEvent e) {
		
		
		
		
	}
	
	
	

	
}
