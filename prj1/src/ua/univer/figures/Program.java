package ua.univer.figures;

public class Program {
	public static void main(String[] args) {

		Point p1 = new Point(1, 1);
		Point p2 = new Point();
		Point p3 = new Point(2, 2);

		System.out.println(p1);
		System.out.println(p2);
		ColorPoint cp1 = new ColorPoint(2, 2, "red");
		System.out.println(cp1);
		Line l1 = new Line(p1, p2);
		System.out.println(l1);

		ColorLine cl1 = new ColorLine(1, 2, 3, 4, "green");
		System.out.println(cl1);
		Triangle tr1 = new Triangle(0, 0, 1, 1, 2, 2);
		System.out.println(tr1);
		Triangle tr2 = new Triangle(p1, p2, p3);
		System.out.println(tr2);
		Triangle tr3 = new Triangle(l1, l1, l1);
		System.out.println(tr3);
		ColorTriangle ctr1 = new ColorTriangle(p1, p2, p3, "red");
		System.out.println(ctr1);
		Menu menu = new Menu();
		menu.runMenu();
	}
}
