
public class Player {
	
	private int x,y,w,h,dx;
	private String pic;
	private double pA,pV;
	
	public Player() {
		x=0;
		y=0;
		w=0;
		h=0;
		dx=0;
		pA=0;
		pV=0;
		pic="";
	}
	
	public Player(int x1,int y1) {
		x=x1;
		y=y1;
		w=60;
		h=70;
		dx=0;
		pA=0;
		pV=0;
		pic="t.png";
	}

	public double getpA() {
		return pA;
	}

	public void setpA(double pA) {
		this.pA = pA;
	}

	public double getpV() {
		return pV;
	}

	public void setpV(double pV) {
		this.pV = pV;
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
		pV+=pA;
		x+=dx;
		y+=pV;
	}	
	
}
