package com.chapter12;

import static java.lang.System.out;
@SuppressWarnings("serial")
class OutOfRangeException extends Exception {

    public OutOfRangeException() {
        out.println("Начал работать конструктор \"OutOfRange\" ");
        out.println();
        out.println("   * *   ");
        out.println(" ******* ");
        out.println();
        out.println("Отработал конструктор \"OutOfRange\" ");
        out.println();
    }
}
