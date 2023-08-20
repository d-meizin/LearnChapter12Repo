package com.chapter12;

import static java.lang.System.out;
class GoodNightsSleep {
    public static void main(String args[]) {
        out.println("Привет! Сейчас будет пауза 7 секунд...");

        try {
            takeANap();
        } catch (InterruptedException e) {
            //out.println("Эй! Кто прервал паузу?");
        }
        
        //takeANap();

        out.println("Пауза закончилась, едем дальше!");

    }

    static void takeANap() throws InterruptedException {
        Thread.sleep(7000);
    }
}
