package labs;

import java.awt.Graphics;
import javax.swing.JPanel;

public class MyPanel extends JPanel {
	public static ITransport airplane;
	public static boolean initialization = false;

	void setAir(ITransport transport) {
		airplane = transport;
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		if (airplane != null) {
			airplane.DrawAirplane(g);
		}
	}
}
