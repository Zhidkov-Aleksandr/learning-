package com.max.idea;

import java.util.Scanner;

public class Scaner {
    public static void main(String[] args) {
        int seconds, minutes, remainingSeconds;

        try (Scanner input = new Scanner(System.in)) {

            // Получить общее время в секундах
            System.out.print("Введите общее времяaa в секундах: ");
            seconds = input.nextInt();
        }

        // Вычислить время в минутах
        minutes = seconds / 60;

        // Вычислить оставшееся кол-во секунд в минуте
        remainingSeconds = seconds % 60;

        //Отобразить время в минутах и оставшихся секундах
        System.out.println(seconds + " сек. содержит " + minutes +
                " мин. и " + remainingSeconds + " сек.");
        System.out.println(Math.pow(2, 3));
    }
}
