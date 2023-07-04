package ru.netology;

public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Иван";
        post.passport = "1234 N 567890";
        post.patronymic = "Иванович";
        post.phone = "+7 913 6666666";
        post.surname = "Иванов";
        post.subscription = true;
        post.birthday = new FormDate();
        post.birthday.day = 13;
        post.birthday.month = 13;
        post.birthday.year = 13;
        // заполните другие поля даты рождения
    }


}