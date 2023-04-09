package Restaurant;

import java.util.ArrayList;

public class Restaurant {
    private String name;
    private int stars;
    private String priceCategory ;
    private ArrayList<Review> reviews = new ArrayList<>();

    public Restaurant() {
    }

    public Restaurant(String name, int stars, String priceCategory) {
        this.name = name;
        this.stars = stars;
        this.priceCategory = priceCategory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public String getPriceCategory() {
        return priceCategory;
    }

    public void setPriceCategory(String priceCategory) {
        this.priceCategory = priceCategory;
    }

    public String addReview(Review review){
        for (Review r : reviews ) {
            if (review.author.equals(r.author)){
                return "you already wrote";
            }
        }
        this.reviews.add(review);
        return "Done";
    }

    public void allReviews(){
        if(this.reviews.isEmpty()){
            System.out.println("there is no review");
        }else{
            for (Review review: reviews) {
                System.out.println(review.toString());

            }}
    }

    @Override
    public String toString() {
        return "name=" + name  + ", stars=" + stars + ", priceCategory=" + priceCategory ;
    }
}
