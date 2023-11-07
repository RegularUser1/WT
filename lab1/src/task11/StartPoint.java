package task11;

public class StartPoint {

    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.addBall(10.2f, "Blue");
        basket.addBall(12.0f, "Yellow");
        basket.addBall(5.7f, "Blue");
        basket.addBall(10.3f, "White");
        basket.addBall(8.2f, "Blue");

        System.out.printf("Total weight: %3.2f %n", basket.calculateWeight());
        System.out.printf("Number of blue balls: %d", basket.numberOfBlueBalls());
    }
}
