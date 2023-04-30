/*
*Пусть дан LinkedList с несколькими элементами. Реализуйте метод(не void), который вернет “перевернутый” список
*/

import java.util.LinkedList;

public class task1 {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            ll.add(getRandomNumber());
        }
        System.out.println("List: "+ll);

        System.out.print("Inverted list: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(ll.getLast() + ", ");
            ll.removeLast();

        }
    }

    public static int getRandomNumber() {
        double x = (Math.random() * 99);
        int num = (int) x;
        return num;
    }
}