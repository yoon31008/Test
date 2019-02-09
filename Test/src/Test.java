import java.awt.MouseInfo;
import java.awt.Point;

public class Test {

	public static void main(String[] args) {
		Point point;
		double x;
		double y;
		
		while (true) {
			point = MouseInfo.getPointerInfo().getLocation();
			x = point.getX();
			y = point.getY();

			System.out.println("X: " + x + " , " + "Y: " + y);
		}
	}
}
