package org.example.test1;

public class User {
    String UserID;
    Member member;

    int totalPrice;
    int totalPoint;
    int parkingFee;


    public User(String UserID, Member member, int price, int time) {
        this.UserID = UserID;
        this.member = member;

        totalPrice = returnPrice(price);
        totalPoint = returnPoint(price);
        parkingFee = returnFee(time);
    }


    public int returnPrice(int price){
        return member.discount(price);
    }

    public int returnPoint(int price){
        return member.point(price);
    }

    public int returnFee(int time){
        return member.parking(time);
    }

    public String viewUserInfo(){
        return UserID + "님의 지불 금액은 " + totalPrice + "원이고, 적립 포인트는 " + totalPoint + "점 입니다.\n"
                + "주차 요금은 " + parkingFee + "원 입니다.";
    }

}
