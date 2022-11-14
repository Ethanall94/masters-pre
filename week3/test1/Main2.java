package org.example.test1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {

        Member RED = new Red();
        Member PLATINUM = new Platinum();
        Member DIAMOND = new Diamond();

        User James =  new User("James", RED, 10000, 2);
        User Tomas = new User("Tomas", RED, 30000, 2);
        User Edward = new User("Edward", PLATINUM, 10000, 2);
        User Percy = new User("Percy", PLATINUM, 30000, 2);
        User Elizabet = new User("Elizabet", DIAMOND, 30000, 2);

        //----------------
//        System.out.println(James.viewUserInfo());
//        System.out.println(Tomas.viewUserInfo());
//        System.out.println(Edward.viewUserInfo());
//        System.out.println(Percy.viewUserInfo());
//        System.out.println(Elizabet.viewUserInfo());
        //----------------

        List<User> UserList = new ArrayList<>(Arrays.asList(James, Tomas, Edward, Percy, Elizabet));
        printUserInfo(UserList);

    }

    public static void printUserInfo(List<User> UserList) {
        for (User user : UserList) {
            System.out.println(user.viewUserInfo());
        }
    }

}
