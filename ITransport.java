package labs;

import labs.DirectionAir.Direction;
import java.awt.*;

public interface ITransport {
	// Установка позиции транспортного средства
	void SetPosition(int x, int y, int width, int height);

	// Перемещение транспортного средства
	void MoveTransport(Direction direction);

	// Отрисовка транспортного средства
	void DrawAirplane(Graphics g);
}