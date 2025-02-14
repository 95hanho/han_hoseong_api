package me._hanho.han_hoseong.model;

public class Background {

	private String color;
	private String size;
	private String position;
	private String repeat;
	private String image;
	
	public Background() {
		// TODO Auto-generated constructor stub
	}

	public Background(String color, String size, String position, String repeat, String image) {
		super();
		this.color = color;
		this.size = size;
		this.position = position;
		this.repeat = repeat;
		this.image = image;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getRepeat() {
		return repeat;
	}

	public void setRepeat(String repeat) {
		this.repeat = repeat;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	@Override
	public String toString() {
		return "Background [color=" + color + ", size=" + size + ", position=" + position + ", repeat=" + repeat
				+ ", image=" + image + "]";
	}
	
}
