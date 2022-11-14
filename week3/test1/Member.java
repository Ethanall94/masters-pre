package org.example.test1;

public class Member {

    double percent;
    int price;
    int salePrice;
    int totalPoint;
    int parking_time;
    int fee;

    public int discount(int price) {
        salePrice = (int)(price * (1-percent));
        return salePrice;
    }

    public int point(int price) {
        totalPoint = (int)(price * percent);
        return totalPoint;
    }

    public int parking(int parking_time) {
        return fee;
    }
}
