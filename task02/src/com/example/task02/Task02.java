package com.example.task02;

public class Task02 {

    public static String solution(String input) {

        // TODO напишите здесь свою корректную реализацию этого метода, вместо сеществующей
        Long num = Long.parseLong(input);
        String rezult = (num >= Byte.MIN_VALUE & num <= Byte.MAX_VALUE) ? "byte": (num >= Short.MIN_VALUE & num <= Short.MAX_VALUE) ? "short":
                (num >= Integer.MIN_VALUE & num <= Integer.MAX_VALUE)? "int" : "long";



        return rezult;
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        String result = solution("123412341234");
        System.out.println(result);

    }

}
