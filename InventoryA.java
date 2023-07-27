package com.chapter12;
import java.util.Scanner;
import java.text.NumberFormat;
import static java.lang.System.out;
class InventoryA {
    public static void main(String args[]) {
        final double boxPrice = 3.05;
        Scanner keyboard = new Scanner(System.in);
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        out.print("Сколько коробок Вы насчитали? ");
        String numBoxesIn = keyboard.next();
        int numBoxes = Integer.parseInt(numBoxesIn);

        out.print("Общая стоимость составляет ");
        out.println(currency.format(numBoxes * boxPrice));
    }
}
