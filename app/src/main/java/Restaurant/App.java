/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Restaurant;

public class App {
    public static void main(String[] args) {
        System.out.println("------------------------------");
        Restaurant restaurant = new Restaurant("Pizza Palace", 4, "$$$");
        restaurant.addReview(new Review("good", "ismail", 5));
        System.out.println(restaurant.toString());
        restaurant.allReviews();
    }
}
