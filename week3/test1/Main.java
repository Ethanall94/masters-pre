package org.example.test1;

public class Main {
    public static void main(String[] args) {

        Member RED = new Red();
        Member PLATINUM = new Platinum();
        Member DIAMOND = new Diamond();

        User James =  new User("James", RED, 10000, 2);
        User Tomas = new User("Tomas", RED, 30000, 2);
        User Edward = new User("Edward", PLATINUM, 10000, 2);
        User Percy = new User("Percy", PLATINUM, 30000, 2);
        User Elizabet = new User("Elizabet", DIAMOND, 30000, 2);

        System.out.println(James.viewUserInfo());
        System.out.println(Tomas.viewUserInfo());
        System.out.println(Edward.viewUserInfo());
        System.out.println(Percy.viewUserInfo());
        System.out.println(Elizabet.viewUserInfo());
    }

}
