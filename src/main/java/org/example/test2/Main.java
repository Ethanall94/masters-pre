package org.example.test2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Book> A = new ArrayList<>();

        A.add(new Book("태백산맥", "조정래"));
        A.add(new Book("이기적 유전자", "리처드 도킨즈"));
        A.add(new Book("자전거 도둑", "박완서"));
        A.add(new Book("토지", "박경리"));
        A.add(new Book("대변동", "제레드 다이아몬드"));

        //얕은 복사
        ArrayList<Book> A_1 = A; //(ArrayList<Book>) A.clone();

        //깊은 복사 - 원본에 영향을 주지 않음
        ArrayList<Book> B = new ArrayList<>();
        for (int i = 0; i < A.size(); i++) {
            B.add(new Book(A.get(i).title, A.get(i).writer));
        }

        //책 추가
        B.add(new Book("사피엔스", "유발 하라리"));
        //책 제목 변경
        A_1.get(2).title = "그 많던 싱아는 누가 다 먹었을까";

        //출력
        ViewBookList printList = new ViewBookList();

        printList.ViewBookList(A, "A");
        printList.ViewBookList(A_1, "A_1");
        printList.ViewBookList(B, "B");
    }
}
