/*
 * Создать класс Мяч. Создать класс Корзина.
 * Наполнить корзину мячиками. Определить вес мячиков в корзине и количество синих мячиков.
 */

package by.epamtc.sinitsyna.logic;

import java.util.Map;

import by.epamtc.sinitsyna.bean.Ball;
import by.epamtc.sinitsyna.bean.BallBasket;

public class BallBasketLogic {
	public long retrieveAllBallsWeight(BallBasket basket) {
		long weight = 0;
		if (basket != null) {
			for (Map.Entry<Ball, Integer> element : basket.getBalls().entrySet()) {
				weight += element.getKey().getWeight() * element.getValue();
			}
		}
		return weight;
	}

	public int retrieveBallsAmountByColor(BallBasket basket, String color) {
		int amount = 0;
		if (basket != null) {
			for (Map.Entry<Ball, Integer> element : basket.getBalls().entrySet()) {
				if (element.getKey().getColor().equals(color)) {
					amount += element.getValue();
				}
			}
		}
		return amount;
	}
}
