package org.example.test1;

public class Red extends Member{

    double percent = 0.01;

    @Override
    public int point(int price) {
        totalPoint = (int)(price * percent);
        return totalPoint;
    }

    @Override
    public int parking(int parking_time) {
        fee = parking_time * 3000;
        return fee;
    }
}
