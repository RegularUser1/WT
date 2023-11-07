package task11;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class BasketTest {

    @Test
    void calculateWeight() {
        Basket basket = new Basket();
        basket.addBall(10.2f,"Blue");
        basket.addBall(9.4f,"Blue");
        basket.addBall(1.0f,"White");
        basket.addBall(0.6f,"Red");
        basket.addBall(19.2f,"Orange");
        basket.addBall(5.8f,"Blue");
        float expected = basket.calculateWeight();
        Assert.assertEquals(expected,46.2f,0.01f);
    }

    @Test
    void numberOfBlueBalls() {
        Basket basket = new Basket();
        basket.addBall(10.2f,"Blue");
        basket.addBall(9.4f,"Blue");
        basket.addBall(1.0f,"White");
        basket.addBall(0.6f,"Red");
        basket.addBall(19.2f,"Orange");
        basket.addBall(5.8f,"Blue");
        int expected = basket.numberOfBlueBalls();
        Assert.assertEquals(expected,3);
    }
}