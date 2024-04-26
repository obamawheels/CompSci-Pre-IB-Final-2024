
public class Player {
	
	private int x,y,w,h,dx,dy;
	private String pic;
	
	public Player() {
		x=0;
		y=0;
		w=0;
		h=0;
		dx=0;
		dy=0;
		pic="";
	}
	
	public Player(int x1,int y1) {
		x=x1;
		y=y1;
		dx=0;
		dy=0;
		w=50;
		h=100;
		pic="t.png";
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getW() {
		return w;
	}

	public void setW(int w) {
		this.w = w;
	}

	public int getH() {
		return h;
	}

	public void setH(int h) {
		this.h = h;
	}

	public String getPic() {
		return pic;
	}

	public void setPic(String pic) {
		this.pic = pic;
	}
	
	public void jump() {
		
	}	
	
	public boolean collision(Brick b) {
	    if (this.getX() + getW() >= b.getX() &&
	        getX() <= b.getX() + b.getW() &&
	        getY() + getH() >= b.getY() &&
	        getY() <= b.getY() + b.getH()) {
	        return true;
	    }
	    return false;
	}
	
	public void move(){
		 x+=dx;
		 y+=dy;
		 }

	public int getDx() {
		return dx;
	}

	public void setDx(int dx) {
		this.dx = dx;
	}

	public int getDy() {
		return dy;
	}

	public void setDy(int dy) {
		this.dy = dy;
	}
	
}
