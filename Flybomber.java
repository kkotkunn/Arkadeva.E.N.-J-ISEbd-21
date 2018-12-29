package labs;

import java.awt.*;

public class Flybomber extends Airplane {

	private Color DopColor;

	void getDopColor(Color DopColor) {
		this.DopColor = DopColor;
	}

	Color setDopColor() {
		return this.DopColor;
	}

	public Flybomber(int maxSpeed, int weight, Color mainColor, Color dopColor) {
		super(maxSpeed, weight, mainColor);
		MaxSpeed = maxSpeed;
		Weight = weight;
		MainColor = mainColor;
		DopColor = dopColor;
	}

	public void DrawAirplane(Graphics g) {
		g.setColor(DopColor);
		g.fillOval(_startPosX + 30, _startPosY - 8, 24, 5);
		g.fillOval(_startPosX + 30, _startPosY + 20, 24, 5);
		super.DrawAirplane(g);
	}
}
