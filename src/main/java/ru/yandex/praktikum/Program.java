package ru.yandex.praktikum;

public class Program {

    public boolean checkIsAdult(int age) { // метод принимает аргумент age — возраст пользователя
        int adultAge = 18; // установили возраст совершеннолетия
        return age >= adultAge; // вернётся результат сравнения аргумента age с возрастом совершеннолетия
    }
    }
