package org.example.test1;

public class Platinum extends Member{

    double percent = 0.05;

    @Override
    public int discount(int price) {
        salePrice = (int)(price * (1-percent));
        return salePrice;
    }

    @Override
    public int point(int price) {
        totalPoint = (int)(price * percent);
        return totalPoint;
    }

    @Override
    public int parking(int parking_time) {
        fee = parking_time * 1000;
        return fee;
    }
}
