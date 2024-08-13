package app;

import java.util.function.Function;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        MathOperation addition = new MathOperation() {
            @Override
            public int operate(int a, int b) {
                return a + b;
            }
        };

        // Лямбда-выражение для преобразования строки в верхний регистр
        StringManipulator toUpperCase = input -> input.toUpperCase();

        // Использование ссылки на метод для передачи метода в качестве аргумента
        Function<String, Integer> uppercaseCounter = StringListProcessor::countUppercase;

        // Поставщик случайных чисел в диапазоне от 1 до 100
        Supplier<Integer> randomSupplier = () -> RandomNumberGenerator.generateRandomNumber(1, 100);

        // Примеры использования
        System.out.println("Addition of 3 and 5: " + addition.operate(3, 5));
        System.out.println("Uppercase of 'hello': " + toUpperCase.manipulate("hello"));
        System.out.println("Uppercase letters in 'Hello World': " + uppercaseCounter.apply("Hello World"));
        System.out.println("Random number between 1 and 100: " + randomSupplier.get());
    }
}