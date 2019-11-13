package ru.job4j.bot;

public class DummyBot {

    public static String answer (String question) {
        String rsl = "Это ставит меня в тупик. Задайте другой вопрос";
        if ("Привет, бот".equals(question)) {
            return "Привет, умник";
        }else if ("Пока, бот".equals(question)) {
            return "До скорой встречи";
        }
        return rsl;


    }
}
