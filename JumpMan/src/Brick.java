public class Brick {
	private int x,y,w,h;
	private String pic;
	
	public Brick() {
		x=0;
		y=0;
		w=0;
		h=0;
		pic="";
	}
	
	public Brick(int x1,int y1) {
		x=x1;
		y=y1;
		w=50;
		h=50;
		pic="ice.gif";
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

	
	
	
}
