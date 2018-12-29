package labs;

import java.awt.Color;
import java.awt.Graphics;
import labs.DirectionAir.Direction;
import java.awt.Color;

public class Airplane extends Vehicle {

	private final int AirplaneWidth = 100;
	private final int AirplaneHeight = 60;
	private Color DopColor;

	void getDopColor(Color DopColor) {
		this.DopColor = DopColor;
	}

	Color setDopColor() {
		return this.DopColor;
	}

	public Airplane(int maxSpeed, int weight, Color mainColor) {
		MaxSpeed = maxSpeed;
		Weight = weight;
		MainColor = mainColor;
	}

	public void MoveTransport(Direction direction) {
		float step = MaxSpeed;
		switch (direction) {
		case Left: {
			if (_startPosX - step > 0) {
				_startPosX -= step;
			}
			break;
		}
		case Right: {
			if (_startPosX + step + AirplaneWidth < _pictureWidth) {
				_startPosX += step;
			}
			break;
		}
		case Up: {
			if (_startPosY - step > 0) {
				_startPosY -= step;
			}
			break;
		}
		case Down: {
			if (_startPosY + step + AirplaneHeight <= _pictureHeight) {
				_startPosY += step;
			}
			break;
		}
		}
	}

	public void DrawAirplane(Graphics g) {
		g.setColor(MainColor);
		g.fillOval(_startPosX, _startPosY + 3, 70, 13);
		g.fillOval(_startPosX + 35, _startPosY - 15, 12, 50);
		g.fillOval(_startPosX + 10, _startPosY - 6, 7, 30);
	}
}
