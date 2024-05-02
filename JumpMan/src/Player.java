
public class Player {
	
	private int x,y,w,h,dx;
	private String pic;
	private double pYA,pYV;
	
	public Player() {
		x=0;
		y=0;
		w=0;
		h=0;
		dx=0;
		pYA=0;
		pYV=0;
		pic="";
	}
	
	public Player(int x1,int y1) {
		x=x1;
		y=y1;
		w=72;
		h=94;
		dx=0;
		pYA=0;
		pYV=0;
		pic="Benji.gif";
	}

	public double getpYA() {
		return pYA;
	}

	public void setpYA(double pA) {
		this.pYA = pA;
	}

	public double getpYV() {
		return pYV;
	}

	public void setpYV(double pV) {
		this.pYV = pV;
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
	
	public int getDx() {
		return dx;
	}

	public void setDx(int dx) {
		this.dx = dx;
	}

	public void move() {
		pYV+=pYA;
		y+=pYV;
		x+=dx;
	}	
	
}
