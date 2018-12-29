package labs;

import java.awt.Color;
import java.awt.Graphics;

import labs.DirectionAir.Direction;

public class Airplane {
	private int _startPosX;
	private int _startPosY;
	private int _pictureWidth;
	private int _pictureHeight;
	private final int AirplaneWidth = 100;
	private final int AirplaneHeight = 60;
	private int MaxSpeed;

	void getMaxSpeed(int MaxSpeed) {
		this.MaxSpeed = MaxSpeed;
	}

	int setMaxSpeed() {
		return this.MaxSpeed;
	}

	private int Weight;

	void getWeight(int Weight) {
		this.Weight = Weight;
	}

	int setWeight() {
		return this.Weight;
	}

	private Color MainColor;

	void getMainColor(Color MainColor) {
		this.MainColor = MainColor;
	}

	Color setMainColor() {
		return this.MainColor;
	}

	private Color DopColor;

	void getDopColor(Color DopColor) {
		this.DopColor = DopColor;
	}

	Color setDopColorr() {
		return this.DopColor;
	}

	public Airplane(int maxSpeed, int weight, Color mainColor, Color dopColor) {
		MaxSpeed = maxSpeed;
		Weight = weight;
		MainColor = mainColor;
		DopColor = dopColor;
	}

	public void SetPosition(int x, int y, int width, int height) {
		_startPosX = x;
		_startPosY = y;
		_pictureWidth = width;
		_pictureHeight = height;
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
