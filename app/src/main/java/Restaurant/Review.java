package Restaurant;

import java.util.ArrayList;

public class Review {
    String body;
    String author;
    int rate;

    public Review() {}

    public Review(String body, String author, int rate) {
        this.body = body;
        this.author = author;
        this.rate = rate;
    }

    @Override
    public String toString() {
        return "body= " + body + ", author= " + author + ", rate= " + rate ;
    }
}
