package com.hw.maxim.objects.and.classes;

public class Main {

    public static void main(String[] args) {
        Author pushkin = new Author("Александр", "Пушкин");
        Book kapitanskayaDochka = new Book("Капитанская дочка", pushkin, 1836);

        Author lermontov = new Author("Михаил", "Лермонтов");
        Book geroyNashegoVremeny = new Book("Герой нашего времени", lermontov, 1839);

//        System.out.println(kapitanskayaDochka.getName());
//        System.out.println(kapitanskayaDochka.getYear());
//
//        System.out.println(geroyNashegoVremeny.getName());
//        System.out.println(geroyNashegoVremeny.getYear());

//        System.out.println(pushkin);
        System.out.println(kapitanskayaDochka);

//        Author pushkin2 = new Author("Александр", "Пушкин");
//
//
//        System.out.println(pushkin.equals(pushkin2));
//        System.out.println(pushkin.hashCode());
//        System.out.println(pushkin2.hashCode());
    }
}
