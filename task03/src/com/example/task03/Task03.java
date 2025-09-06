package com.example.task03;

public class Task03 {

    public static int getMetreFromCentimetre(int centimetre) {

        int rezult = centimetre / 100;

        return rezult;
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        int result = getMetreFromCentimetre(299);
        System.out.println(result);

    }

}
