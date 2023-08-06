package com.chapter12;

import static java.lang.System.out;
@SuppressWarnings("serial")
class FiveException extends Exception {

    public FiveException(String song) {
        out.println("Начал работать конструктор \"Five\" ");
        out.println();
        out.println(" ******* ");
        out.println("...здесь могут быть слова песни \"" + song + "\"");
        out.println(" ******* ");
        out.println();
        out.println("Отработал конструктор \"Five\" ");
        out.println();
    }
}
