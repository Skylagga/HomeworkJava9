package ru.netology;

public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.birthday = new FormDate();
        post.name = "Иван";
        post.patronymic = "Иванович";
        post.surname = "Иванов";
        post.birthday.day = 11;
        post.birthday.month = 9;
        post.birthday.year = 1992;
        post.phone = "+7(977)-777-77-77";
        post.password = "qwerty123";
        post.subscription = true;
    }
}
