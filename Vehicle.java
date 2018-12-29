package labs;

import labs.DirectionAir.Direction;
import java.awt.*;

public abstract class Vehicle implements ITransport {
	// ���������� X
	protected int _startPosX;
	// ���������� Y
	protected int _startPosY;
	// ������ ���� ���������
	protected int _pictureWidth;
	// ������ ���� ���������
	protected int _pictureHeight;
	// ������������ �������� ������������� ��������
	protected int MaxSpeed;
	// ��� ������������� ��������
	protected float Weight;
	// �������� ���� ������������� ��������
	protected Color MainColor;

	public int getMaxSpeed() {
		return MaxSpeed;
	}

	public float getWeight() {
		return Weight;
	}

	public Color getMainColor() {
		return MainColor;
	}

	// ����������� ����� ��������� ������������� ��������
	public void SetPosition(int x, int y, int width, int height) {
		_startPosX = x;
		_startPosY = y;
		_pictureWidth = width;
		_pictureHeight = height;
	}

	// ����� ��������� ������������� ��������
	public abstract void DrawAirplane(Graphics g);

	// ����� ����������� ������������� ��������
	public abstract void MoveTransport(Direction direction);
}