package com.chapter12;

import static java.lang.System.out;
class DemoFinally {

    public static void main(String args[]) {
        try {
            doSomething();
        } catch (Exception e) {
            out.println("Исключение перехвачено в методе main().");
        } finally {
            out.println("Напечатано во втором блоке finally");
        }
        out.println("Отработал метод main().");
    }

    static void doSomething() {
        try {
            out.println(0 / 0);
        } catch (Exception e) {
            out.println("Исключение перехвачено в методе doSomething().");
            //out.println(0 / 0);
        } finally {
            out.println("Напечатано в первом блоке finally.");
        }

        out.println("Будет ли это напечатано?");
    }
}
