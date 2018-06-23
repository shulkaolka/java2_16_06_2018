package ua.univer.figures;

public class ColorLine extends Line {
	public ColorLine(Point start, Point end, String color) {
		super(start, end);
		setColor(color);
	}

	public ColorLine(int x1, int y1, int x2, int y2, String color) {
		super(x1, y1, x2, y2);
		setColor(color);
	}

	private String color;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "ColorLine [Color = " + getColor() + ", " + super.toString() + "]";
	}

}
