package com.chapter12;

import static java.lang.System.out;
import java.util.Scanner;
import java.text.NumberFormat;
class InventoryC {
    public static void main(String args[]) {
        final double boxPrice = 3.05;
        boolean goodInput = false;
        Scanner keyboard = new Scanner(System.in);
        NumberFormat currency = NumberFormat.getCurrencyInstance();

        out.print("Сколько коробок (5 не вводить) Вы насчитали? ");
        do {
            String numBoxesIn = keyboard.next();

            try {
                int numBoxes = Integer.parseInt(numBoxesIn);

                if (numBoxes < 0) {
                    throw new OutOfRangeException();
                }
                if (numBoxes == 5) {
                    throw new FiveException();
                }

                out.print("Итоговая стоимость равна ");
                out.println(currency.format(numBoxes * boxPrice));
                out.println();
                goodInput = true;
            } catch (NumberFormatException e) {
                out.println("Это не число!");
                out.println("Введите целое число");
                out.println();
            } catch (OutOfRangeException e) {
                out.print(numBoxesIn);
                out.println(" ??? Это невозможно!");
                out.println("Введите целое, не отрицательное число");
                out.println();
            } catch (FiveException e) {
                out.println("Эээ дружок, мы так не договаривались...");
                out.println("Введите целое число кроме 5");
                out.println();
            }
        } while (!goodInput);
        out.println("Отлично! Программа завершена.");
    }
}
