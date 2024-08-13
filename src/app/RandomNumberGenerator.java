package app;

import java.util.Random;

// Класс для генерации случайных чисел
class RandomNumberGenerator {
    // Метод для генерации случайного числа в заданном диапазоне
    public static int generateRandomNumber(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }
}